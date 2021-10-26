package divideandconquer;

import java.util.ArrayList;
import java.util.Arrays;

/*
* 병합정렬
* 재귀용법을 활용한 정렬 알고리즘
* 1. 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
* 2. 각 부분 리스트를 재귀적으로 합병 절렬을 이용해 정렬한다.
* 3. 두 부분 리스트를 다시 하나의 정렬된 리스트로 병합한다.
* 시간 복잡도: O(NlogN)
* */
public class MergeSort {
    /* split
    *  merge
    *  */
    // step1. 배열을 앞뒤 두 배열로 짜를 코드 작성해보기(일반화)
    public ArrayList<Integer> splitFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 1){
            return dataList;
        }
        int medium = dataList.size() / 2;
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        //0부터 medium-1 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        leftArr = splitFunc(new ArrayList<Integer>(dataList.subList(0,medium)));
        rightArr = splitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        System.out.println(leftArr);
        System.out.println(rightArr);

        return mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr){
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        //CASE1: left/right 둘가 있을 때
        while (leftArr.size() > leftPoint && rightArr.size() > rightPoint){
            if(leftArr.get(leftPoint) > rightArr.get(rightPoint)){
                mergedList.add(rightArr.get(rightPoint));
                rightPoint += 1;
            }else {
                mergedList.add(leftArr.get(leftPoint));
                leftPoint += 1;
            }
        }

        //CASE2: right 데이터가 없을 때
        while (leftArr.size() > leftPoint){
            mergedList.add(leftArr.get(leftPoint));
            leftPoint += 1;
        }

        //CASE3: left 데이터가 없을 때
        while (rightArr.size() > rightPoint){
            mergedList.add(rightArr.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> testData = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        result = mergeSort.splitFunc(new ArrayList<Integer>(Arrays.asList(4,1,2,3,5,7)));
        System.out.println("result: " + result);

        //random data 생성
//        for(int index = 0; index < 100; index++){
//            testData.add((int)(Math.random()*100));
//        }
//        result = mergeSort.splitFunc(testData);
//        System.out.println(result);
    }
}
