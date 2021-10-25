package _sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//실전문제 "위에서 아래로"
/*
입력 예시
3
15
27
12
*/
public class UpDown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //Arrays.sort(arr);
        // for(int i=arr.length-1; i>=0; i--){
        //     System.out.print(arr[i]+ " ");
        // }
    }    
}
