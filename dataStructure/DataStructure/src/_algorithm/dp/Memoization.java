package _algorithm.dp;
//top-down 방식
public class Memoization {
    public static long[] d = new long[100];

    public static long fibo(int x){
        System.out.println("f("+x+") ");
        if(x==1 || x==2){
            return 1;
        }

        //이미 계산한 적이 있는 문제라면 그대로 반환
        if(d[x] != 0){
            return d[x];
        }

        d[x] = fibo(x-1) + fibo(x-2);
        return d[x];
    }

    public static void main(String[] args){
        //한 번 계산된 결과를 메모이제이션하기 위한 배열 초기화
        System.out.println(fibo(6));
    }
}
