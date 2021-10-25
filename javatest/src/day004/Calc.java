package day004;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<args.length; i++) {
			int n = Integer.parseInt(args[i]);
			sum += n;
		}
		System.out.println("sum = "+sum);
	}

}
