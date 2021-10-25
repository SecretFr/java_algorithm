package Java_Collection;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<NameClass> listImpl = new HashSet<NameClass>();
		listImpl.add(new NameClass("박", "석진"));
		listImpl.add(new NameClass("김", "석진"));
		listImpl.add(new NameClass("차", "석진"));
		listImpl.add(new NameClass("이", "석진"));
		for (NameClass nameClass : listImpl) {
			System.out.println(nameClass.getFirstName() + nameClass.getSubName());
		}
	}

}
