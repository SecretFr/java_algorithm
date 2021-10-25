package _algorithm._binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DDeokBBoKi {
    public static int binarySearch(int[] arr, int target, int start, int end){
        int result = 0;
        while(start<=end){
            long total = 0;
            int mid = (start+end) / 2;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > mid) total += arr[i] - mid;
            }
            if(total < target){
                end = mid -1;
            }
            else{
                result = mid;
                start = mid + 1;
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length-1];

        int result = binarySearch(arr, m, 0, end);

        System.out.println(result);
    }
}
