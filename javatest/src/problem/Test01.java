package problem;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int k=5;k>5-i;k--) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
