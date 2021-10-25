package _string;

import java.io.IOException;
import java.util.Scanner;
//  ' ' = 32, '\n' = 10
public class boj_1152ex02 {
    public static void main(String[] args) throws IOException{
        /*
        문자 아스키코드 값 알아낼때 사용
        Scanner sc = new Scanner(System.in);

        char ch = '\n';
        int asc = (int)ch;
        System.out.println(asc);
        */
        int cnt = 0;
        int str;
        int pre_str = 32; // 32는 ' '공백 아스키 코드

        while(true){
            str = System.in.read();

            if(str == 32){
                if(pre_str != 32) cnt++;
            }
            else if(str == 10){
                if(pre_str != 32){
                    cnt++;
                }
                break;
            }

            pre_str = str;
        }

        System.out.println(cnt);
    }
}
