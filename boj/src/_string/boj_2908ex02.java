package _string;

import java.util.Scanner;

public class boj_2908ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();
        int answer = 0;

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        answer = A > B ? A : B;
        System.out.println(answer);
    }
}
