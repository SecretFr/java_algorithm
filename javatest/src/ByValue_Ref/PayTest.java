package ByValue_Ref;

class Pay{
	int ppp;
	public void payRefer(Pay a) {
		a.ppp = a.ppp + 2000;
	}
	public int payValue(int j) {
		j = j + 2000;
		return j;
	}
}

public class PayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay p = new Pay();
		p.ppp = 10;
		
		int i = 10;
		
		p.payRefer(p); // call by reference
		p.payValue(i);
		System.out.println(i); // call by value
		i = p.payValue(i); // call by value, return을 통한 값 바꾸기
		
		System.out.println(p.ppp);
		System.out.println(i);
	}

}
