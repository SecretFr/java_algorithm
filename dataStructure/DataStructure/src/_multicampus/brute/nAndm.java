package _multicampus.brute;

import java.util.Scanner;

//https://www.acmicpc.net/problem/15651
public class nAndm {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M+1];
    }

    static void rec_func(int k){
        if(k == M + 1){
            for(int i=1; i<=M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        }
        else{
            for(int cand = 1; cand <= N; cand++){
                selected[k] = cand;
                //k+1번 ~ M번을 모두 탐색하는 일을 해야하는 상황
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args){
        input();

        //1번째 원소부터 M번째 원소를 조건에 맞는 모든 방법을 찾아줘
        rec_func(1);
        System.out.println(sb.toString());
    }
}
