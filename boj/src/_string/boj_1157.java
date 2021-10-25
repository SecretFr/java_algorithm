package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        // str = str.toUpperCase();

        for(int i=0; i<str.length(); i++){
            if('A'<=str.charAt(i) && str.charAt(i) <= 'Z'){
                arr[str.charAt(i)-'A']++;
            }
            else{
                arr[str.charAt(i)-'a']++;
            }
            // if(str.length()==1){
            //     System.out.println(str);
            // }
            // arr[str.charAt(i)-'A']++;
        }
        
        char ch = '?';
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        // Arrays.sort(arr);
        // if((arr[arr.length-1] == arr[arr.length-2]) && arr[arr.length-1]!=0){
        //     System.out.println("?");
        //     return;
        // }
        System.out.println(ch);
    }
}
