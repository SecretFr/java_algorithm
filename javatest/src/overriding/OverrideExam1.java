package overriding;

//메소드 원형이 다름으로 오버라이딩이 아닙니다. 단순 상속

class OverA{
	void show(String str) {
		System.out.println("상위 클래스의 메소드 show() 수행 "+str);
	}
	
	void overShow(String str) {
		System.out.println("superClass"+str);
	}
}

class SubOverA extends OverA{
	void show() {
		System.out.println("하위 클래스의 메소드 show() 수행");
	}
	
	//overriding
	void overShow(String str) {
		System.out.println(str+" subClass "+str);
	}
	
	//overloading
	void overShow(String str, int n) {
		System.out.println(str+" subClass "+n);
	}
}

public class OverrideExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubOverA over = new SubOverA();
		over.overShow("Coin!");
		over.overShow("Doge", 600);
	}

}
