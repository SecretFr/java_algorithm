package _algorithm._greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CantMoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
            
        }
        // System.out.println(max);

        Collections.sort(arr);

        int target = 1;
        for(int i=0; i<n; i++){
            if(target < arr.get(i)) break;
            target = target + arr.get(i);
        }

        System.out.println(target);
        // for(int i=0; i<arr.size(); i++){
        //     System.out.println(arr.get(i));
        // }
    }
}
