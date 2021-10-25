package _algorithm._greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UntilOne {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while(true){
            
            if(N % K == 0){
                N /= K;
                cnt++;
                if(N == 1) break;
            }
            else{
                N -= 1;
                cnt++;
                if(N == 1) break;
            }
            
            
        }
        System.out.println(cnt);
        
    }
}
