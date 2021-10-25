package problem;
import java.util.Scanner;
class Info {
	String name;
	String addr;
	String birth;
	
	Info(){};
//	Info(String name, String addr, String birth){
//		this.name = name;
//		this.addr = addr;
//		this.birth = birth;
//	}
}

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Info p = new Info();
		
		p.name = sc.next();
		p.addr = sc.next();
		p.birth = sc.next();
		
		System.out.println("name : "+p.name);
		System.out.println("address : "+p.addr);
		System.out.println("birth : "+p.birth);
	}

}
