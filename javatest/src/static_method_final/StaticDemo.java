package static_method_final;

//static 변수는 프로그램을 실행시 최초 한번만 특정값으로 초기화되고 더이상 초기화x
//따라서 한번 만들어진 static 변수는 계속적으로 값이 증가 및 감소된다.
//static 변수는 객체를 여러번 생성해도 한번만 생성이 된다.
//static 변수는 멤버 메소드에 선언할 수 없다.

class Box{
	int cnt = 0;
	static long boxID = 0;
	
	public Box() {
		boxID = boxID + 1; //static variable
		cnt = cnt + 1; //member variable
		System.out.println("member variable cnt: "+cnt);
		System.out.println("static variable boxID: "+boxID);
	}
	//멤버 메소드에서는 static 변수를 선언할 수 없습니다.
//	public void staticTest() {
//		static long count =0;
//		count = count +1;
//	}
	
	//static(class) 메소드에 static 변수를 선언할 수 없습니다.
//	public static void staticTest2() {
//		static long count = 0;
//		count = count + 1;
//	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		
//		System.out.println(mybox1.Box());

	}

}
