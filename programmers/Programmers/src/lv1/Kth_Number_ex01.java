package lv1;

import java.util.Arrays;

//copyOfRange를 이용한 문제풀이

class Solution1{
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
	}
}

public class Kth_Number_ex01 {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {
				{2,5,3},
				{4,4,1},
				{1,7,3}
		};
		int[] answer = {};
		
		Solution1 s = new Solution1();
		
		answer = s.solution(array, commands);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}

	}

}
