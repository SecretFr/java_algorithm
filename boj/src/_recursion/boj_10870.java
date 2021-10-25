package _recursion;

import java.util.Scanner;

public class boj_10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        answer = fibo(n);
        System.out.println(answer);

    }
    public static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else{
            return n = fibo(n-1) + fibo(n-2);
        }
    }
}
