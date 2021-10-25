package overriding;

class Person {
	String name;
	String phone;
	static int ID;

	public void setName(String s) {
		this.name = s;
	}

	public String getPhone() {
		return phone;
	}

	public static int getID() {
		return ID;
	}
}

class Professor extends Person {
	
	public void setName(String s) {
		
	}

	public String getPhone() {
		return phone;
	}
	
	
	public void getPhone(String phone) {
	}

	public int getID(int i) {
		return i;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
