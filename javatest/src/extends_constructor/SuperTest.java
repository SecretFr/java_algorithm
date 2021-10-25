package extends_constructor;

class School{
	int year=0;
	public School() {
		this.year=10;
	}
}

class MiddleSchool extends School{
	int year=0;
	public MiddleSchool() {
		this.year=3;
	}
	
	public void prn() {
		System.out.println("year: " + year); 
        System.out.println("this.year: " + this.year + " " +this.hashCode()); 
        System.out.println("super.year: " + super.year + " " +super.hashCode()); //부모클래스 
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleSchool middleSchool = new MiddleSchool();
		middleSchool.prn();
	}

}
