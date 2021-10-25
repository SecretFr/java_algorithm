package _multicampus.graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph {
    public static void main(String[] args){
        HashMap<String, Integer> mapData1 = new HashMap<String, Integer>();
        HashMap<String, Integer> mapData2 = new HashMap<String, Integer>(10);
        HashMap<String, ArrayList<String>> mapData3 = new HashMap<String, ArrayList<String>>();

        mapData1.put("A", 1);
        mapData2.put("B", 2);

        System.out.println(mapData1);
        System.out.println(mapData1.get("A"));

        //HashMap 데이터 수정
        mapData1.put("B", 3);
        System.out.println(mapData1);

        //HashMap 데이터 삭제
        mapData1.remove("A");
        System.out.println(mapData1);

        mapData3.put("A", new ArrayList<String>(Arrays.asList("B","C")));
        System.out.println(mapData3);
    }
}
