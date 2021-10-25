package _string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import java.util.Scanner;
// import java.nio.charset.StandardCharsets;

public class boj_11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte value : br.readLine().getBytes()){
            System.out.println(value);
        }
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // byte[] bytes = a.getBytes(StandardCharsets.US_ASCII);
        // System.out.println(bytes[0]);
        // int ch = System.in.read();
        // System.out.println(ch);
    }
}