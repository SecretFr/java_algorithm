package _algorithm.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] d = new int[m+1];
        Arrays.fill(d, 10001);
        
        //다이나믹 프로그래밍 진행(보텀업)
        d[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=arr[i]; j<=m; j++){
                //(i-k)원을 만드는 방법이 존재하는 경우
                if(d[j - arr[i]] != 10001){
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }
        if(d[m] == 10001){
            System.out.println(-1);
        }
        else{
            System.out.println(d[m]);
        }
    }
}
