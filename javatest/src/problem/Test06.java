package problem;
import java.util.Calendar;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		int currYear = calendar.get(Calendar.YEAR);
		
		String[] info = new String[4];
		int age = 0;
		
		for(int i=0; i<info.length; i++) {
			info[i] = sc.next();
		}
		age = Integer.parseInt(info[3].substring(0,2));
		age += 1900;
		
		System.out.println("name: "+info[0]);
		System.out.println("phone: "+info[1]);
		System.out.println("adress: "+info[2]);
		System.out.println("age: "+(currYear-age));
	}

}
