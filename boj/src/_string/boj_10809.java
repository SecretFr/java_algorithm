package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//a = 97 , z=122
public class boj_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        // boolean[] check = new boolean[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
            // check[i] = false;
        }

        for(int i=0; i<str.length(); i++){
            // int cnt = 0;
            // cnt = str.charAt(i) - 'a';
            if(arr[str.charAt(i)-'a'] == -1){
                arr[str.charAt(i)-'a'] = i;
            }
            // if(!check[cnt]){
            //     check[cnt] = true;
            // }
            
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
