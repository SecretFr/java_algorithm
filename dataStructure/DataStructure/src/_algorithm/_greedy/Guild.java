package _algorithm._greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Guild {
    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        int result=0;
        int count=0;
        for(int i=0; i<n; i++){
           arrayList.add(sc.nextInt());
            // arr[i] = sc.nextInt();
        }

        Collections.sort(arrayList);
        // Arrays.sort(arr);

        for(int i=0; i<arrayList.size(); i++){
            count += 1;
            if(count >= arrayList.get(i)){
                result += 1;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
