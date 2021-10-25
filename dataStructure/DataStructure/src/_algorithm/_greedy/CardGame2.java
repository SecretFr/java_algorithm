package _algorithm._greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardGame2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        // int[] answer = new int[N];
        int result = 0;
        for(int i=0; i<N; i++){
            int min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                // if(min > arr[i][j]){
                //     min = arr[i][j];
                //     answer[i] = min;
                // }
                min = Math.min(min, arr[i][j]);
            }
            result = Math.max(result, min);
        }

        // Arrays.sort(answer);

        System.out.println(result);

    }
}
