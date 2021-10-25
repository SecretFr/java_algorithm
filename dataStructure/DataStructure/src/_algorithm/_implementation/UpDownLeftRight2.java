package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight2 {
    public static int[] dx = {0,0,-1,1};
    public static int[] dy = {-1,1,0,0};
    public static String[] move_types = {"L", "R", "U", "D"};
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        int x = 1;
        int y = 1;
        int nx = 0;
        int ny = 0;
        while(st.hasMoreTokens()){
            String input = st.nextToken();
            nx = -1;
            ny = -1;
            for(int i=0; i<move_types.length; i++){
                if(input.equals(move_types[i])){
                    nx = x + dx[i];
                    ny = y + dy[i];
                }
            }
            if(nx<1 || ny<1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        System.out.println(x+" "+y);
    }
}
