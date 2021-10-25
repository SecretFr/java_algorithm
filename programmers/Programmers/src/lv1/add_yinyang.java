package lv1;

class Solution3{
	public int solution(int[] absolutes, boolean[] signs) {
		int answer =  0;
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i] == false) {
				absolutes[i] = -absolutes[i];
			}
			answer = answer + absolutes[i];
		}
		return answer;
	}
}

public class add_yinyang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 s = new Solution3();
		int[] absolutes = {1,2,3};
		boolean[] signs = {false, false, true};
		int answer = 0;
		
		answer = s.solution(absolutes, signs);
		
		System.out.println(answer);
	}

}
