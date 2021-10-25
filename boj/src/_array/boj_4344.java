package _array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        int[] arr;

        for(int i=0; i<testCase; i++){
            st = new StringTokenizer(br.readLine()," ");
            
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            
            double sum = 0.0;
            double avg = 0.0;
            double cnt = 0.0;
            double rate = 0.0;

            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
                
            }
            avg = sum / n;

            for(int k=0; k<n; k++){
                if(arr[k] > avg){
                    cnt++;
                }
            }
            rate = (cnt/n) * 100;

            System.out.printf("%.3f%%\n", rate);
        }
    }
}
