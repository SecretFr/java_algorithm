package ByValue_Ref;

class Change{
	String str;
	public void changeString(Change c) {
		c.str = "JSP";
	}
	
}

public class StringTest {
	private String changeString(String src) {
		src = "JSP";
		return src;
//		System.out.println(src);
	}
	
	public static void main(String[] args) {
		System.out.println("ABCD".toLowerCase());
		System.out.println("ABCD".hashCode());
		
		Change c = new Change();
		c.str = "JAVA";
		
		System.out.println(c.str);
		c.changeString(c);
		System.out.println(c.str);
	
		String step = "JAVA";
		StringTest st = new StringTest();
		
		System.out.println(step);
		step = st.changeString(step); // no change
		System.out.println(step);
		
	}
}
