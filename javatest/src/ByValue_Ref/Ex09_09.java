package ByValue_Ref;

public class Ex09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");
		String str4 = new String("Java Programming");
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println("원 문자열1 ===> ["+str1.hashCode()+"]");
		System.out.println("원 문자열2 ===> ["+str2.hashCode()+"]");
		System.out.println("원 문자열3 ===> ["+str3.hashCode()+"]");
		System.out.println("원 문자열4 ===> ["+str4.hashCode()+"]");
		
		System.out.println("문자열1==문자열2 결과 :\t"+(str1 == str2));
		//항상 문자열은 equals로 비교하는 것이 좋다.
		System.out.println("문자열1.equals(문자열2) 결과 :\t"+str1.equals(str2));
		System.out.println("문자열1==문자열3 결과 :\t"+(str1 == str3));
		System.out.println("문자열1.equals(문자열3) 결과 :\t"+str1.equals(str3));
		System.out.println("문자열4==문자열3 결과 :\t"+(str4 == str3));
		System.out.println("obj==obj2 결과 : \t" + (obj == obj2));
	}

}
