package sequentialSearch;

import java.util.ArrayList;

/*
* 탐색은 여러 데이터 중 원하는 데이터를 찾아내는 것을 의미
* 데이터가 담겨있는 리스트를 앞에서부터 하나씩 비교해서 원하는 데이터를 찾는 방법
*/
public class SequentialSearch {
    public int searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        for (int index = 0; index < dataList.size(); index++) {
            if(dataList.get(index) == searchItem){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0; i<10; i++){
            testData.add((int)(Math.random()*100));
        }

        SequentialSearch sequentialSearch = new SequentialSearch();
        System.out.println(sequentialSearch.searchFunc(testData, 15));
    }
}
