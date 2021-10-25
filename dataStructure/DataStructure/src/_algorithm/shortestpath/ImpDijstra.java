package _algorithm.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Node1{
    private int index;
    private int distance;
    
    public Node1(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    
    public int getDistance() {
        return distance;
    }
    public int getIndex() {
        return index;
    }


}

public class ImpDijstra {
    public static final int INF = (int)1e9;
    public static int n, m, start;
    public static boolean[] visit = new boolean[100001];
    public static int[] d = new int[100001];

    public static ArrayList<ArrayList<Node1>> graph = new ArrayList<ArrayList<Node1>>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Node1>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node1(b,c));
        }

        Arrays.fill(d, INF);
    }
}
