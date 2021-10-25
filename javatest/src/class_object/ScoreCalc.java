package class_object;

public class ScoreCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score p1 = new Score();
		Score p2 = new Score();
		Score p3 = new Score();
		
		p1.name = "Daramg";
		p1.kor = 80;
		p1.eng = 90;
		p1.math = 60;
		p1.sum = (float)(p1.kor + p1.eng + p1.math);
		p1.avg = p1.sum / 3;
		
		p2.name = "Son";
		p2.kor = 88;
		p2.eng = 92;
		p2.math = 25;
		p2.sum = (float)(p2.kor + p2.eng + p2.math);
		p2.avg = p2.sum / 3;
		
		p3.name = "kane";
		p3.kor = 30;
		p3.eng = 50;
		p3.math = 80;
		p3.sum = (float)(p3.kor + p3.eng + p3.math);
		p3.avg = p3.sum / 3;
		
		System.out.println("Name : "+p1.name);
		System.out.println("KOR : "+p1.kor);
		System.out.println("ENG : "+p1.eng);
		System.out.println("MATH : "+p1.math);
		System.out.println("Sum : "+p1.sum);
		System.out.println("Average : "+p1.avg);
		
		System.out.println();
		
		System.out.println("Name : "+p2.name);
		System.out.println("KOR : "+p2.kor);
		System.out.println("ENG : "+p2.eng);
		System.out.println("MATH : "+p2.math);
		System.out.println("Sum : "+p2.sum);
		System.out.println("Average : "+p2.avg);
		
		System.out.println();
		
		System.out.println("Name : "+p3.name);
		System.out.println("KOR : "+p3.kor);
		System.out.println("ENG : "+p3.eng);
		System.out.println("MATH : "+p3.math);
		System.out.println("Sum : "+p3.sum);
		System.out.println("Average : "+p3.avg);
	}

}
