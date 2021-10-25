package _string;

import java.io.IOException;

public class boj_2908ex04 {
    public static void main(String[] args) throws IOException{

        int a=0, b=0;

        a += System.in.read() - 48;
        a += (System.in.read() - 48) * 10;
        a += (System.in.read() - 48) * 100;

        System.in.read();

        b += System.in.read() - 48;
        b += (System.in.read() - 48) * 10;
        b += (System.in.read() - 48) * 100;

        System.out.println(a > b ? a : b);
    }
}
