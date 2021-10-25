package Java_Collection;

import java.util.Set;
import java.util.TreeSet;

//Comparable 구현 시
public class NameClass implements Comparable<NameClass> {
	private String firstName;
	private String subName;

//	public NameClass() {
//	}

	public NameClass(String firstName, String subName) {
		super();
		this.firstName = firstName;
		this.subName = subName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSubName() {
		return subName;
	}

	@Override
	public int compareTo(NameClass input) {
		return firstName.compareTo(input.firstName);
	}

	public static void main(String[] args) {
		Set<NameClass> treeSet = new TreeSet<>();
		treeSet.add(new NameClass("박", "석진"));
		treeSet.add(new NameClass("김", "석진"));
		treeSet.add(new NameClass("차", "석진"));
		treeSet.add(new NameClass("이", "석진"));
		
		
		
		for (NameClass nameClass : treeSet) {
//			System.out.println(treeSet.remove(nameClass));
			System.out.println(nameClass.getFirstName() + nameClass.getSubName());
		}
		
		System.out.println();
		
		//생성자에서 comparator 인터페이스 구현 시
		Set<NameClass> treeSet1 = new TreeSet<>(
				(NameClass first, NameClass second) -> first.getFirstName().compareTo(second.getFirstName()));
		treeSet1.add(new NameClass("박", "석진"));
		treeSet1.add(new NameClass("김", "석진"));
		treeSet1.add(new NameClass("차", "석진"));
		treeSet1.add(new NameClass("이", "석진"));
		for (NameClass nameClass : treeSet1) {
			System.out.println(nameClass.getFirstName() + nameClass.getSubName());
		}
	}
}
