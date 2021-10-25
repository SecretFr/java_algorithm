package practice._implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position{
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

class Node{
    private int time;
    private char direction;

    public Node(int time, char direction){
        this.time = time;
        this.direction = direction;
    }

    public int getTime(){
        return this.time;
    }

    public char getDirection(){
        return this.direction;
    }
}

public class Snake {
    public static int n, k, l;
    public static int[][] arr = new int[101][101];
    public static ArrayList<Node> info = new ArrayList<>();

    //동, 남, 서, 북
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static int turn(int direction, char c){
        if(c == 'L'){
            direction = (direction == 3) ? 3 : direction - 1;
        }
        else{
            direction = direction + 1;
        }
        return direction;
    }

    public static int simulate(){
        int x = 1, y = 1;
        arr[x][y] = 2;
        int direction = 0;
        int time = 0;
        int index = 0;

        Queue<Position> posi = new LinkedList<>();
        posi.offer(new Position(x, y));

        while(true){
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(1 <= nx && nx <= n && 1 <= ny && ny <= n && arr[nx][ny] != 2){
                if(arr[nx][ny] == 0){
                    arr[nx][ny] = 2;
                    posi.offer(new Position(nx, ny));
                    Position prev = posi.poll();
                    arr[prev.getX()][prev.getY()] = 0;
                }
                if(arr[nx][ny] == 1){
                    arr[nx][ny] = 2;
                    posi.offer(new Position(nx,ny));
                }
            }
            else{
                time += 1;
                break;
            }

            x = nx;
            y = ny;
            time += 1;

            // 회전할 시간인 경우 회전
            if(index < l && time == info.get(index).getTime()){
                direction = turn(direction, info.get(index).getDirection());
                index += 1;
            }
        }

        return time;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    
}
