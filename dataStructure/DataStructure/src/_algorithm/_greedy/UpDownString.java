package _algorithm._greedy;

import java.util.Scanner;

public class UpDownString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = new int[input.length()];
        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i) - '0';
        }

        if(arr[0] == 1){
            //1을 0으로
            count0 += 1;
        }
        else{
            //0을 1로
            count1 += 1;
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                if(arr[i+1] == 1){
                    //1을 0으로
                    count0 += 1;
                }
                else{
                    //0을 1로
                    count1 += 1;
                }
            }
        }

        //int answer = count0 > count1 ? count1 : count0 ;
        int answer = Math.min(count0, count1);
        System.out.println(answer);
    }
}
