package _algorithm._bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    private int x;
    private int y;

    public Node(int x, int y){
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

public class EscapeMaze {
    public static int n, m;
    public static int[][] graph = new int[201][201];
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<Node>();
        q.offer(new Node(x, y));

        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            //현재 위치에서 4가지 방향으로의 위치 확인
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                //미로 찾기 공간을 벗어난 경우 무시
                if(nx < 0 || nx >=n || ny < 0 || ny >=m) continue;
                //벽인경우 무시
                if(graph[nx][ny] == 0) continue;
                //해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(graph[nx][ny] == 1){
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return graph[n-1][m-1];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            String input = sc.nextLine();
            for(int j=0; j<m; j++){
                graph[i][j] = input.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0,0));

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(graph[i][j]+" ");
        //     }
        //     System.out.println();
        // }


    }
}
