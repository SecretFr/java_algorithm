package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int cnt = 0;
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");

        // cnt = st.countTokens();

        System.out.println(st.countTokens());
        // while(st.hasMoreTokens()){
        //     System.out.println(st.nextToken());
        //     cnt++;
        // }
        // System.out.println(cnt);

    }
}
