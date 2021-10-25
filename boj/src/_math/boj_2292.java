package _math;

import java.util.Scanner;

public class boj_2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        int range = 2;
        if(n==1){
            System.out.println(count);
        }else{
            //1 2 8 20 38
            while(range <= n){
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
