package lv1;

//use regex
class Solution5{
	public String solution(String new_id) {
		//step1
		String answer = new_id.toLowerCase();
		
		//step2
		answer = answer.replaceAll("[^-_.a-z0-9]","");
		//step3
		answer = answer.replaceAll("[.]{2,}", ".");
		//step4
		answer = answer.replaceAll("^[.]|[.]$", "");
		
		//step5
		if(answer.equals("")) {
			answer += "a";
		}
		
		//step6
		if(answer.length()>=16) {
			answer = answer.substring(0,15);
			answer = answer.replaceAll("[.]$", "");
		}
		
		//step7
		if(answer.length() <= 2) {
			while(answer.length() < 3) {
				answer += answer.charAt(answer.length()-1);
			}
		}
		return answer;
	}
}

public class kakao_recommandId_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		String input = "...!@BaT#*..y.abcdefghijklm";
		
		input = s.solution(input);
		
		System.out.println(input);
	}

}
