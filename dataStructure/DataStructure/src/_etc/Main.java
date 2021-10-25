package _etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int a = Integer.parseInt(br.readLine());
        // String n = br.readLine();
        // StringTokenizer st = new StringTokenizer(n, ".");
        // char[] n = br.readLine().toCharArray();
        // float f = Float.parseFloat(st.nextToken());
        // float f2 = Float.parseFloat(st.nextToken());
        // char n = sc.next().charAt(0);
        // int asc = (int)(n);
        int n = sc.nextInt();
        char asc = (char)n;
        // String year = st.nextToken();
        // String mon = st.nextToken();
        // String day = st.nextToken();

        
        // String id = st.nextToken();
        // id += st.nextToken();
        // String a = st.nextToken();
        // String b = st.nextToken();
        // System.out.printf("%.0f\n",f);
        // System.out.printf("%.0f",f2);
        // int n = Integer.parseInt(br.readLine(), 16);
        System.out.printf("%c",asc);
        // int temp = 0;
        // int b = 10000;

        // for(int i=0; i<5; i++){
        //     temp = n / b;
        //     temp *= b;
        //     n %= b;
        //     b /= 10;
        //     System.out.println("["+temp+"]");
        // }

    }
}
