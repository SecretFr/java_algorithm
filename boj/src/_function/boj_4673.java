package _function;
//10000
//d(n) = n + (n/10) + (n%10)
public class boj_4673 {
    public static int selfNum(int n){
        int sum = n;
        while(n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 0;
        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; i++){
            n = selfNum(i);
            if(n<10001){
                check[n] = true;
            }
        }

        for(int i=1; i<10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }

    }
}
