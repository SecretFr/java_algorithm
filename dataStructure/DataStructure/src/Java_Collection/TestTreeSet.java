package Java_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list = new TreeSet<Integer>();
		list.add(1);
		list.add(30);
		list.add(15);
		list.add(12);
		list.add(7);
		list.add(3);
//		for (NameClass nameClass : list) {
//			System.out.println(nameClass.getFirstName() + nameClass.getSubName());
//		}
		
		System.out.println("First ele: "+list.first());
		System.out.println("Last ele: "+list.last());
		System.out.println("Higher 12: "+list.higher(12));
		System.out.println("Lower 12: "+list.lower(12));
		System.out.println("contains 7: "+list.contains(7));
		System.out.println("remove 7: "+list.remove(7));
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
