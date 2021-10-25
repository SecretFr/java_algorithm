package _multicampus.greedy;

public class Coin {
    public static void main(String[] args){
        int[] coin = {500, 100, 50, 1};
        int pay = 4720;
        int cnt = 0;

        for(int i=0; i<coin.length; i++){
            cnt = cnt + (pay / coin[i]);
            pay = pay % coin[i];
        }

        System.out.println(cnt);
    }
}
