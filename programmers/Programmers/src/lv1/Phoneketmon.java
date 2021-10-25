package lv1;

import java.util.HashSet;

class Solution6{
	public int solution(int[] nums) {
		int answer = 0;
		int max = nums.length / 2;
		
		HashSet<Integer> numSet = new HashSet<Integer>();
		
		for(int num : nums) {
			numSet.add(num);
		}
		
//		System.out.println(numSet.contains(3));
		if(numSet.size()>max) {
			answer = max;
			return answer;
		}
		else {
			answer = numSet.size();
			return answer;
		}
		
	}
}

public class Phoneketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,3,2,2,4,2,3};
		Solution6 s = new Solution6();
		
		
		System.out.println(s.solution(nums));
	}

}
