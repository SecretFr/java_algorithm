package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyStraight {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[input.length()];
        for(int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i) - '0';
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<arr.length / 2; i++){
            leftSum += arr[i];
        }
        for(int i=arr.length/2; i<arr.length; i++){
            rightSum += arr[i];
        }
        
        if(leftSum == rightSum){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("READY");
        }
    }    
}
