package _recursion;

import java.util.Scanner;

public class boj_10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pactorial(n));
        

    }
    public static int pactorial(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        else{
            return n * pactorial(n-1);
        }
    }
}
