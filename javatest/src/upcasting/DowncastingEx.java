package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("홍길동"); // 업캐스팅 발생
		Student s;

		s = (Student) p; // 다운캐스팅

		System.out.println(s.name); // 오류 없음
		s.grade = "A"; // 오류 없음
		System.out.println(s.grade);
	}

}
