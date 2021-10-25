package a;

public class B2 extends A2{
	void set() {
		i=1;
		pro = 2;
		//private member access denied.
//		pri =3;
		pub =4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b = new B2();
		b.set();
	}

}
