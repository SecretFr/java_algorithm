package _multicampus.greedy;


import java.util.ArrayList;
import java.util.Arrays;

public class Coin2 {
    public static void coinFunc(Integer price, ArrayList<Integer> coinList){
        Integer totalCoin = 0;
        Integer coinNum = 0;
        for(int i=0; i<coinList.size(); i++){
            coinNum = price / coinList.get(i);
            System.out.println(coinList.get(i)+"원: "+coinNum);
            totalCoin += coinNum;
            price -= coinNum * coinList.get(i);
        }
        System.out.println("총 갯수: "+totalCoin);
    }

    public static void main(String[] args){
        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500, 100, 50, 1));
        coinFunc(4720, coinList);
    }
}
