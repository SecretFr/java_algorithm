package upcasting;

class Person {
	String name;
	String id;

	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;

	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p;
		Student s = new Student("이재문");
		p = s; // 업캐스팅 발생
		s.grade = "B";
		s.department = "asdf";
		System.out.println(p.name); // 오류 없음

//		  p.grade = “A”; // 컴파일 오류
//		  p.department = “Com”; // 컴파일 오류
		
		s = (Student) p;
		s.grade = "A";
		s.department = "Com";
		System.out.println(s.grade);
		System.out.println(s.department);
	}

}
