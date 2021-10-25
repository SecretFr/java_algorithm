package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2675 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        
        for(int i=0; i<testCase; i++){
            /*
            String[] str = br.readLine.split(" ");
            int n = Integer.parseInt(str[0]);
            String s = str[1];
            */
            st = new StringTokenizer(br.readLine()," ");
            
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            // String answer = "";
            
            for(int j=0; j<str.length(); j++){
                for(int k=0; k<n; k++){
                    System.out.print(str.charAt(j));
                    // answer += str.charAt(j);
                }
            }
            System.out.println();
            // System.out.println(answer);
        }
    }
}
