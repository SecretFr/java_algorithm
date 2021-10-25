package _array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj_8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        String[] ox = new String[testCase];

        for(int i=0; i<testCase; i++){
            ox[i] = br.readLine();
        }

        for(int i=0; i<testCase; i++){
            int sum = 0;
            int cnt = 0;
            for(int j=0; j<ox[i].length(); j++){
                if(ox[i].charAt(j) == 'O'){
                    cnt++;
                    sum += cnt;
                }
                else{
                    cnt = 0;
                }
            }
            sb.append(sum).append('\n');
            // System.out.println(sum);
        }
        System.out.println(sb);
    }
}
