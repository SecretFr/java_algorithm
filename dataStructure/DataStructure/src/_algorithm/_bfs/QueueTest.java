package _algorithm._bfs;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<5;i++){
            q.add(i+1);
            System.out.println("Queue Peek(): "+q.peek());
        }
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        q.clear();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
