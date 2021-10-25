package _sort;

import dataStructure.ArrayListTest;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<(arr.length-1)-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
