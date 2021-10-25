package corejava;

import java.util.Vector;

public class BoxingUnBoxingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Character> str = new Vector<Character>(5,5);
		
		str.add('A');
		str.add('B');
		str.add('C');
		str.add('D');
		str.add('E');
		str.remove(3);
		
		print(str);
	}
	
	public static void print(Vector<Character> v) {
		int num = v.size();
		String str = "";
		for(int i=0; i<num; i++) {
			System.out.println(v.get(i));
		}
		for(int i=0; i<num; i++) {
			str += v.get(i);
		}
		System.out.println(str);
	}
}