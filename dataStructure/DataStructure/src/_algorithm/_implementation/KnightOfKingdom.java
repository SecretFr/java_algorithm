package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KnightOfKingdom {
    public static final int[] dx = {1,-1,1,-1,-2,-2,2,2};
    public static final int[] dy = {-2,-2,2,2,1,-1,1,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        char[] arr = input.toCharArray();

        int x = Character.getNumericValue(arr[1]);
        int y = Character.getNumericValue(arr[0] - '0');
        int count = 0;
        int nx = -1;
        int ny = -1;
        for(int i=0; i<8; i++){
            nx = x + dx[i];
            ny = y + dy[i];
            if(nx >= 1 && nx <=8 && ny >= 1 && ny <= 8){
                count++;
            }
        }
        System.out.println(count);

    }
}
