package lv2.sort;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations){
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i < citations.length; i++){
            int h = citations.length - i;
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] input = {
                3, 0, 6, 1, 5
        };
        HIndex hIndex = new HIndex();
        int result = hIndex.solution(input);
        System.out.println(result);
    }
}
