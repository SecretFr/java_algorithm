package overloading_constructor;

class School4{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	//기본 생성자 선언
	public School4() {
		
	}
	
	public School4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	public int hap() {
		tot = kuk + eng;
		
		return tot;
	}
}

public class SchoolMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School4 sc4 = new School4(); 
        sc4.kuk=90; 
        sc4.eng=100; 
        System.out.println("hap: " + sc4.hap());   

        School4 sc = new School4(90, 100); 
        System.out.println("hap: " + sc.hap()); 
	}

}
