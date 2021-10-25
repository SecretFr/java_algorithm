package _algorithm._greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42891?language=java
//우선순위 큐 사용
class Food implements Comparable<Food>{
    private int time;
    private int index;

    public Food(int time, int index){
        this.time = time;
        this.index = index;
    }

    public int getTime(){
        return this.time;
    }

    public int getIndex(){
        return this.index;
    }

    @Override
    public int compareTo(Food other){
        return Integer.compare(this.time, other.time);
    }
}

class Solution {
    public int solution(int[] food_times, long k) {
        long summary = 0;
        for(int i=0; i<food_times.length; i++){
            summary += food_times[i];
        }
        if(summary <= k){
            return -1;
        }

        //시간이 작은 음식부터 빼기 위해 우선순위 큐로 이동
        PriorityQueue<Food> pq = new PriorityQueue<>();
        for(int i=0; i<food_times.length; i++){
            //(음식시간, 음식번호) 형태로 우선순위 큐에 삽입
            pq.offer(new Food(food_times[i], i+1));
        }
        // while(!pq.isEmpty()){
        //     Food food = pq.poll();
        //     System.out.println("time: "+food.getTime()+" index: "+food.getIndex());
        // }

        //먹기 위해 사용한 시간
        summary = 0;
        //직전에 다 먹은 음식 시간
        long previous = 0;
        //남은 음식의 개수
        long length = food_times.length;

        while(summary + ((pq.peek().getTime() - previous) * length) <= k){
            int now = pq.poll().getTime();
            summary += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        ArrayList<Food> result = new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }

        Collections.sort(result, new Comparator<Food>(){
            @Override
            public int compare(Food a, Food b){
                return Integer.compare(a.getIndex(), b.getIndex());
            }
        });

        return result.get((int) ((k - summary) % length)).getIndex();
    }
}

public class MukBang {
    public static void main(String[] args){
        int[] food_times = {3,1,2};
        long k=5;
        int ans;

        Solution sol = new Solution();

        ans = sol.solution(food_times, k);

        System.out.println(ans);
    }
}
