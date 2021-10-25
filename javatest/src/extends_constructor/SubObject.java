package extends_constructor;

class SuperObject{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {//동적 바인딩
		System.out.println(name);
	}
}

public class SubObject extends SuperObject{
	
	protected String name;
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		SuperObject b = new SubObject();
		b.paint();
	}

}
