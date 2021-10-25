package _abstract;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc a = new GoodCalc();
		int[] avg = {90,100,97,85,100};
		System.out.println(a.add(10, 5));
		System.out.println(a.sub(10, 5));
		System.out.println(a.average(avg));
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

}
