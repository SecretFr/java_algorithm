package problem;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int min, max;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
