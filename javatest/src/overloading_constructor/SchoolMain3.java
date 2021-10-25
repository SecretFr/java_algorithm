package overloading_constructor;

//기본 생성자를 선언한 경

class School3 {
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	//기본 생성자 선언
	public School3() {
		
	}
	
	public int hap() {
		tot = kuk + eng;
		
		return tot;
	}
	
}
public class SchoolMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School3 sc2 = new School3();
		sc2.kuk = 90;
		sc2.eng = 100;
		System.out.println("hap: "+sc2.hap());
	}

}
