package pb;

import pa.A3;

public class B3 extends A3{
	void set() {
//		i=1; i is default member, compile error
		pro=2;
//		pri=3; private member access denied, compile error
		pub=4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 b = new B3();
		b.set();
	}

}
