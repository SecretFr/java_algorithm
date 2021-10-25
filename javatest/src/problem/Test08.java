package problem;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		
		if(a>0) {
			System.out.println("양수입니다.");
		}
		else if(a < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
	}

}
