package inheritance;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
	    B b = new B();
	    b.setM(10);
	    b.setN(5);
	    System.out.println(b.toString());
	}
	
}
