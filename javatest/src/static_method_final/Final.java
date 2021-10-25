package static_method_final;

//값을 변경할 수 없는 final 변수(상수 선언)
//값을 고정할 필요가 있는 코드와 같은 형태의 데이터에 사용합니다.
//ex) 1년 12달, 요일, 주 7일

class FinalClass{
	int money = 10000; //instance variable
	
	//값을 변경할 수 없습니다.
	final int day = 7;
	final int week = 4;
	
	//객체를 만들지 않아도 사용할 수 있습니다.
	final static int month = 12;
	
	public FinalClass() {}
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass fi = new FinalClass();
		System.out.println(fi.money);
		fi.money = 15000;
		System.out.println(fi.money);
		//final 변수는 값을 변경 및 대입할 수 없습니다. fi.day=10;
		System.out.println("1주일 용돈: "+fi.money * fi.day);
		System.out.println("1년"+FinalClass.month + "달");
		//FinalClass.month = 200000;
		
	}

}
