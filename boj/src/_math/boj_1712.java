package _math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import jdk.jfr.Unsigned;
/*
수식 고정비용 + (가변비용 * x) = 판매비용 * x
    고정비용 / (판매비용 - 가변비용) = x
*/
public class boj_1712 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        long fixCost = Integer.parseInt(st.nextToken());
        int varCost = Integer.parseInt(st.nextToken());
        int proCost = Integer.parseInt(st.nextToken());
        long breakPoint = 0;
        long income = 0;
        while(true){
            
            fixCost = fixCost + varCost;
            income = income + proCost;
            breakPoint++;

            if(varCost >= proCost){
                breakPoint = -1;
                break;
            }
            else if(income > fixCost){
                break;
            }
        }
        //수식을 이용한 풀이
        /*
        if(varCost > proCost){
            System.out.println("-1");
        }
        else{
            System.out.println((fixCost/(proCost - varCost)) + 1);
        }
        */
        System.out.println(breakPoint);


    }

}
