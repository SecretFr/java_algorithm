package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException{
        int testCase = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<testCase; i++){
            
            if(check() == true){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean check() throws IOException{
        boolean[] chk = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);

            if(prev != now){
                if(chk[now-'a'] == false){
                    chk[now-'a'] = true;
                    prev = now;
                }else{
                    return false;
                }
            }
            else{
                continue;
            }

        }
        return true;
    }
}
