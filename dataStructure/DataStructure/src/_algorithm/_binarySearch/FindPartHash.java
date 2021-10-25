package _algorithm._binarySearch;

import java.util.HashSet;
import java.util.Scanner;

public class FindPartHash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> s = new HashSet<Integer>();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            s.add(x);
        }

        int m = sc.nextInt();
        int[] target = new int[m];
        for(int i=0; i<m; i++){
            target[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            if(s.contains(target[i])){
                System.out.print("yes ");
            }
            else{
                System.out.print("no ");
            }
        }
    }
}
