package _algorithm._binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindPart {
    public static String binarySearch(int[] arr, int target, int start, int end){
        if(start>end) return "no";
        int mid = (start+end) / 2;
        if(arr[mid] == target) return "yes";
        else if(arr[mid] > target){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, end);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int[] arr1 = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr1.length; i++){
            String answer = "";
            answer = binarySearch(arr, arr1[i], 0, n-1);
            System.out.print(answer+" ");
        }
    }
}
