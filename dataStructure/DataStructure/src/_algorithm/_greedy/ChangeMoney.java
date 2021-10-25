package _algorithm._greedy;
/*
화폐의 종류만큼 반복
화폐의 종류 K개라면
시간복잡도 O(K)
*/
public class ChangeMoney {
    public static void main(String[] args){
        int[] arr = {500, 100, 50, 10};
        int cnt = 0;
        int n = 1260;
    
        for(int i=0; i<arr.length; i++){
            int coin = arr[i];
            cnt = cnt + (n/coin);
            n = n % coin;
        }

        System.out.println(cnt);

    }
}
