package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vision {
    public static final int MIN = 60;
    public static final int SEC = 60;
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hour = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<=hour; i++){     
            for(int j=0; j<MIN; j++){                
                for(int k=0; k<SEC; k++){
                    if(check(i, j, k)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);        
    }
    public static boolean check(int h, int m, int s){
        if((h%10 == 3)
            || (m/10 == 3 || m%10 == 3)
            || (s/10 == 3 || s%10 == 3)
        ){
            return true;
        }
        return false;
    }
}
