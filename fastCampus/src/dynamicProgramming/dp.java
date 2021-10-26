package dynamicProgramming;

/*
* Memoization 기법을 활용
* 프로그램 실행 시 이전에 계산한 값을 저장하여, 다시 계산하지 않도록 하여 전체 실행 속도를 빠르게 하는 기술
* ex)피보나치
* 상향식 접근법: 가장 최하위 답을 구한 후, 저장하고, 결과값을 이용해서 상위 문제를 풀어가는 방식
* */
public class dp {
    public int fibo(int n){
        if(n <= 1)
            return n;
        return this.fibo(n-1) + this.fibo(n-2);
    }

    public int dynamicFunc(int data){
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for(int index = 2; index < data + 1; index++){
            cache[index] = cache[index - 1] + cache[index - 2];
        }
        return cache[data];
    }
    public static void main(String[] args){
        dp dp = new dp();
        int result = dp.dynamicFunc(10);
        System.out.println(result);
    }
}
