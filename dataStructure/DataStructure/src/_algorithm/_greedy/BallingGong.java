package _algorithm._greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BallingGong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int count = 0;
        // System.out.println(arr.get(1));

        for(int i=0; i<n; i++){
            for(int j=i; j<n-1; j++){
                if(arr.get(i) != arr.get(j+1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
