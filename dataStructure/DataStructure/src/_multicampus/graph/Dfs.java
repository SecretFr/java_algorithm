package _multicampus.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Stack을 이용한 구현
//시간 복잡도 O(V+E), V=노드 수, E=간선 수
public class Dfs {
    public static ArrayList<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode){
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();

        needVisit.add(startNode);
        while (needVisit.size() > 0){
            String node = needVisit.remove(needVisit.size() - 1);
            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        ArrayList<String> result = new ArrayList<>();
        result = dfsFunc(graph, "A");
        System.out.println(result);
    }
}
