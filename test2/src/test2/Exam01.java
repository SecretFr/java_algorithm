package test2;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int currYear = cal.get(cal.YEAR);
		
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("생년월일 입력: ");
		String birth = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(birth, "-");
		
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		
		currYear = (currYear - year)+1;
		System.out.println("이름 "+name);
		System.out.println("나이 "+currYear);
		System.out.println("생일 :"+month+"월 "+day +"일 ");
		
		
	}

}
