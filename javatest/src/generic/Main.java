package generic;

class ClassName<E>{
	//generic variable
	private E element;
	
	//generic method
	void set(E element) {
		this.element = element;
	}
	
	//generic method
	E get() {
		return element;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.set("10");
		b.set(10);
		
		System.out.println("a data: "+a.get());
		//반환된 변수의 타입 출력
		System.out.println("a E Type: "+a.get().getClass().getName());
		
		System.out.println("b data: "+b.get());
		System.out.println("b E Type: "+b.get().getClass().getName());
	}

}
