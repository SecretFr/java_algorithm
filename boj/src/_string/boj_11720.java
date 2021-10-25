package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        int sum = 0;
        for(byte value : br.readLine().getBytes()){
            System.out.println(value);
            sum += (value - '0');
        }
        System.out.println(sum);
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // String str = sc.next();

        // int sum=0;
        // for(int i=0; i<n; i++){
        //     sum = sum + (str.charAt(i)-'0');
        // }
        // System.out.println(sum);
        
    }
}
