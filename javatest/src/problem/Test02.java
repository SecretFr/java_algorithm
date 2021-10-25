package problem;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotto[] = new int[6];
		System.out.println("Lotto number");
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			System.out.print(lotto[i]+" ");
		}
	}

}
