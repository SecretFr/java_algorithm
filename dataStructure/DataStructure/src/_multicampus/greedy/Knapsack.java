package _multicampus.greedy;

import java.util.Arrays;
import java.util.Comparator;

//class Edge{
//    Integer distance;
//    String vertex;
//
//    public Edge(Integer distance, String vertex){
//        this.distance = distance;
//        this.vertex = vertex;
//    }
//
////    @Override
////    public int compareTo(Edge e){
////        return this.distance - e.distance;
////    }
//}

public class Knapsack {
    public static void kanpsackFunc(Integer[][] objectList, double capacity){
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] objectItem1, Integer[] objectItem2) {
                return (objectItem2[1] / objectItem2[0]) - (objectItem1[1] / objectItem1[0]);
            }
        });

        for(int i=0; i<objectList.length; i++){
            for(int j=0; j<objectList[i].length; j++){
                System.out.print(objectList[i][j]+" ");
            }
            System.out.println();
        }

        for(int index = 0; index<objectList.length; index++){
            if((capacity - (double)objectList[index][0]) >= 0){
                capacity -= (double)objectList[index][0];
                totalValue += (double)objectList[index][1];
                System.out.println("무게: "+ objectList[index][0]+", 가치: "+objectList[index][1]);
            }
            else {
                fraction = capacity / (double)objectList[index][0];
                totalValue += (double)objectList[index][1] * fraction;
                System.out.println("무게: "+ objectList[index][0]+", 가치: "+objectList[index][1]+", 비율: "+fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치: "+totalValue);
    }

    public static void main(String[] args){
        Integer[][] objectList = { {10, 10}, {15, 12}, {25, 8}, {20, 10}, {30, 5} };
        kanpsackFunc(objectList, 30.0);

//        Edge edge1 = new Edge(9, "A");
//        Edge edge2 = new Edge(13, "A");
//        Edge edge3 = new Edge(11, "A");
//        Edge[] edges = new Edge[]{edge1, edge2, edge3};
//        Arrays.sort(edges, new Comparator<Edge>() {
//            @Override
//            public int compare(Edge o1, Edge o2) {
//                return o2.distance-o1.distance;
//            }
//        });
//        for(int index=0; index < edges.length; index++){
//            System.out.println(edges[index].distance);
//        }
    }
}