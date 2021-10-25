package _interface;

public class Interlmpl implements Inter {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interlmpl inter = new Interlmpl();
		System.out.println(inter.add(10, 10));
		System.out.println(inter.sub(5, 10));
		
		// 인터페이스는 기능이 구현되어 있지않음으로
		// 객체를 생성할 수 없습니다.
		// ----------------------------------------
		// Inter inter = new Inter();

		// 인터페이스는 구현 클래스를 할당 받을 수 있습니다.
		// 인터페이스 = 구현 클래스
		// ----------------------------------------
		
		Inter inter2 = new Interlmpl();
		System.out.println(inter2.add(25, 10));
		System.out.println(inter2.sub(100, 10));
	}

}
