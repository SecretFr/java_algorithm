package lv1;

import java.util.ArrayList;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<=nums.length; i++) {
        	if(i+2 >= nums.length) break;
        	for(int j=i+1; j<nums.length; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			list.add(nums[i]+nums[j]+nums[k]);
        		}
        	}
        }
        
        //isPrime
       for(Integer i : list) {
    	   if(i==2) answer++;
    	   for(int count=2; count<i; count++) {
    		   if(i%count==0) {
    			   answer--;
    			   break;
    		   }
    	   }
    	   answer++;
       }
        
        return answer;
    }
    
}

public class Make_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s = new Solution2();
		int[] nums = {1,2,7,6,4};
		int answer = 0;
		
		answer = s.solution(nums);
		
		System.out.println(answer);
	}

}
