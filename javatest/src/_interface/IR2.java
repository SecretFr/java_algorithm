package _interface;

interface B {
	void display(String s);
}

class D1 implements B {
	String str = "";

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		str = s;
		System.out.println("☆☆☆☆☆☆☆☆☆ " + str);
	}

}

class D2 implements B {
	String str = "";

	@Override
	public void display(String s) {
		// TODO Auto-generated method stub
		str = s;
		System.out.println("★★★★★★★★★ " + str);
	}
}

public class IR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new D1();
		b.display("석모도 - 보문사 - 벤뎅이 회무침");
		
		b = new D2();
		b.display("대부도 - 방아머리 - 바지락 칼국수");
		
		//인터페이스 타입은 구현 클래스의 변수에  
	    //접근할 수 없습니다. 
	    //------------------------------------- 
	    //System.out.println(b.str); 
	     
	    //구현 객체의 멤버변수에 접근하려면  
	    //인터페이스의 구현 클래스 타입으로 형변환을 합니다. 
	    //------------------------------------- 
		
		D2 d2 = (D2)b;
		d2.str = "typeCasting";
		System.out.println(d2.str);
	}

}
