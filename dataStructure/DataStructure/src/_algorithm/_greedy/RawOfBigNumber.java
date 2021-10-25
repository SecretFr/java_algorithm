package _algorithm._greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RawOfBigNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = br.readLine();
        st = new StringTokenizer(input, " ");
        int sum = 0;
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int tempCnt = k;
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while(m > 0){
            while(tempCnt > 0){
                if(m == 0) break;
                sum += arr[arr.length-1];
                tempCnt--;
                m--;
            }
            if(tempCnt == 0){
                sum += arr[arr.length-2];
                m--;
                tempCnt = k;
            }
        }

        System.out.println(sum);
    }
}
