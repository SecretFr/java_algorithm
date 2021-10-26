package divideandconquer;

import java.util.ArrayList;
import java.util.Arrays;

/*
* 기준점(Pivot)을 정해서, 기준점보다 작은 데이터는 왼쪽, 큰 데이터는 오른쪽으로 모으는 함수 작성
* 왼쪽, 오른쪽은 재귀용법을 사용해서 다시 동일 함수를 호출하여 위 작업을 반복함
* 함수는 왼쪽, 기준점, 오른쪽을 리턴
* 시간복잡도: O(NlogN)
* 이미 정렬된 경우 최악의 시간복잡도를 가진다 O(N^2)
*/
public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if(dataList.size() <= 1){
            return dataList;
        }

        Integer pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int index = 1; index < dataList.size(); index++){
            if(dataList.get(index) > pivot){
                rightArr.add(dataList.get(index));
            }
            else{
                leftArr.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<>();
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));

        return mergedArr;
    }

    public static void main(String[] args){
        ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(4,1,2,7,5));
        ArrayList<Integer> result = new ArrayList<>();
        QuickSort quickSort = new QuickSort();
        result = quickSort.sort(testData);
        System.out.println(result);
    }
}
