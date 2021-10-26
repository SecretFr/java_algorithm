package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* 정렬이 되어 있어야 찾을 수 있다.
* O(logN)
*/
public class BinarySearch {
    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        if (dataList.size() == 1 && searchItem == dataList.get(0)) {
            return true;
        }
        if(dataList.size() == 1 && searchItem != dataList.get(0)){
            return false;
        }
        if(dataList.size() == 0){
            return false;
        }

        int mid = dataList.size() / 2;

        if(searchItem == dataList.get(mid)){
            return true;
        }
        else{
            if(searchItem < dataList.get(mid)){
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(0,mid)), searchItem);
            }
            else{
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(mid, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> testData = new ArrayList<>();
        boolean check = false;

        for(int i=0; i<100; i++){
            testData.add((int)(Math.random()*100));
        }

        Collections.sort(testData);
        System.out.println(testData);

        BinarySearch binarySearch = new BinarySearch();
        check = binarySearch.searchFunc(testData,4);

        System.out.println(check);
    }
}
