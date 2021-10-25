package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // int[][] arr = new int[N][N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int x = 0;
        int y = 0;
        while(st.hasMoreTokens()){
            String input = st.nextToken();
            
            switch(input){
                case "R" :
                    if(y>=4) break;
                    else{
                        y++;
                    }
                    break;
                case "L" :
                    if(y<=0) break;
                    else{
                        y--;
                    }
                    break;
                case "U" :
                    if(x<=0) break;
                    else{
                        x--;
                    }
                    break;
                case "D" :
                    if(x>=4) break;
                    else{
                        x++;
                    }
                    break;
            }
        }
        System.out.println((x+1)+" "+(y+1));
    }
}
