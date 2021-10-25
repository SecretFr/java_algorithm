package _algorithm._implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDev {
    //동서남북 방향 정의
    public static final int[] dx = {0,0,1,-1};
    public static final int[] dy = {1,-1,0,0};
    public static int[][] d = new int[50][50];
    public static int[][] map = new int[50][50];
    public static int direction, x, y;

    public static void turn_left(){
        direction -= 1;
        if(direction == -1) direction = 3;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // System.out.println(N+" "+M);
        st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());
        
        d[x][y] = 1;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 1;
        int turn_time = 0;
        while(true){
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if(d[nx][ny] == 0 && map[nx][ny] == 0){
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt++;
                turn_time = 0;
                continue;
            }
            else{
                turn_time++;
            }
            if(turn_time == 4){
                nx = x - dx[direction];
                ny = y - dy[direction];
                if(map[nx][ny] == 0){
                    x = nx;
                    y = ny;
                }
                else{
                    break;
                }
                turn_time = 0;
            }
        }
        System.out.println(cnt);
    }
}
