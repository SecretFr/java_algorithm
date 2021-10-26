package lv2.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BigNumber {
    public String solution(int[] numbers){
        String answer = "";
        String[] result = new String[numbers.length];
        for(int i=0; i < numbers.length; i++){
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o2+o1: "+(o2+o1));
                System.out.println("o1+o2: "+(o1+o2));
                return ((o2+o1).compareTo(o1+o2));
            }
        });

        if(result[0].equals("0")) return "0";

        System.out.println("result: "+Arrays.toString(result));

        for(String s : result){
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] number = {
                6, 10, 2
        };
        BigNumber bigNumber = new BigNumber();
        String result =  bigNumber.solution(number);
        System.out.println(result);
    }
}
