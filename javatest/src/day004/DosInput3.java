package day004;
import java.text.DecimalFormat;

public class DosInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat comma = new DecimalFormat("\u00A4###,###");
		String cs1;
		String cs2;
		
		String s1 = args[0]; // name
		
		int i1 = Integer.parseInt(args[1]); // pay
		cs1 = comma.format(i1);
		
		int i2 = Integer.parseInt(args[2]); // tax
		cs2 = comma.format(i2);
		
		System.out.println("args.length: "+ args.length);
		System.out.println("name: "+ s1);
		System.out.println("pay: "+ cs1);
		System.out.println("tax: "+ cs2);
		System.out.println("income: "+ comma.format(i1-i2));
	}

}
