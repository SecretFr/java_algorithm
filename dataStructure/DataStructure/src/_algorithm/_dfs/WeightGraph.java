package _algorithm._dfs;

import java.util.ArrayList;
import java.util.Scanner;

class Edge<W, V>{
    private W weight;
    private V v;

    public void setEdge(W weight, V v){
        this.weight = weight;
        this.v = v;
    }
}

public class WeightGraph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = 4;
        int m = 5;
        ArrayList<Edge<Integer, Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            graph.add(new Edge<>());
        }

        for(int i=0; i<m; i++){
            int n1 = sc.nextInt(); //노드1
            int n2 = sc.nextInt(); //노드2

            int weight = sc.nextInt();

            graph.get(n1).setEdge(n2, weight);
            graph.get(n2).setEdge(n1, weight);
        }

    }
}
