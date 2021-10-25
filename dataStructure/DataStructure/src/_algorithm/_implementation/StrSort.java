package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class StrSort {
    public static String str;
    public static ArrayList<Character> result = new ArrayList<>();
    public static int value = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        
        for(int i=0; i<str.length(); i++){
            //알파벳인 경우 리스트에 삽입
            if(Character.isLetter(str.charAt(i))){
                result.add(str.charAt(i));
            }
            // 숫자는 따로 더하기
            else{
                value += str.charAt(i) - '0';
            }
        }

        Collections.sort(result);

        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i));
        }

        if(value != 0){
            System.out.print(value);
        }
        System.out.println();
    }
}
