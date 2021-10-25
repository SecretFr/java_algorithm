package overriding;

class OverB{
	void show() {
		System.out.println("superClass's method show()");
	}
	
	void parent() {
		System.out.println("Only exist superClass's method parent()");
	}
}

class SubOverB extends OverB{
	//Overriding
	void show() {
		System.out.println("subClass's method show()");
	}
}

public class OverrideExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverB ob = new OverB();
		ob.show();
		ob.parent();
		
		SubOverB over = new SubOverB();
		over.show();
		over.parent();
	}

}
