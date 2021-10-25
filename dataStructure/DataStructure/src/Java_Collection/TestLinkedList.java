package Java_Collection;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NameClass> list = new LinkedList<>();
		list.add(new NameClass("Park", "JaeWon"));
		list.add(new NameClass("Yang", "Naldo"));
		list.add(new NameClass("Kim", "Marie"));
		list.add(new NameClass("Ho", "Sik"));
		
//		NameClass nameClass = new NameClass();
//		System.out.println(nameClass.hashCode());
		
		for(NameClass nameClass : list) {
			System.out.println(nameClass.getFirstName()+nameClass.getSubName());
		}
	}

}
