package inheritance;

class Movie{
	String prat = "movie";
}

class Korea extends Movie{
	String m1 = "korean movie";
}

class Foreign extends Movie{
	String m1 = "Foreign Movie";
}


public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea k = new Korea();
		System.out.println("jenre : "+k.prat);
		System.out.println("title : "+k.m1);
		
		Foreign f = new Foreign();
		System.out.println("jenre : "+f.prat);
		System.out.println("title : "+f.m1);
	}

}
