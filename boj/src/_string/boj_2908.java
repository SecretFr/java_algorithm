package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int[] arr = new int[3];
        int[] temp = new int[2];
        for(int i=0; i<temp.length; i++){
            int num = Integer.parseInt(st.nextToken());
            int k=0;
            int sum=0;
            while(num > 0){
                arr[k] = num % 10;
                num = num / 10;
                // System.out.println(arr[k]);
                if(k == 0){
                    sum += arr[k] * 100;
                }
                else if(k == 1){
                    sum += arr[k] * 10;
                }
                else{
                    sum += arr[k];
                }
                k++;
            }
            temp[i] = sum;
        }
        int answer = temp[0] > temp[1] ? temp[0] : temp[1];
        System.out.println(answer);
    }
}
