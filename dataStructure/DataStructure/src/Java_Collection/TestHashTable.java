package Java_Collection;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,NameClass> listImpl = new Hashtable<>();
        listImpl.put("1",new NameClass("박", "석진"));
        listImpl.put("2",new NameClass("김", "석진"));
        listImpl.put("3",new NameClass("차", "석진"));
        listImpl.put("4",new NameClass("이", "석진"));
        System.out.println(listImpl.get("1").getFirstName());
        for (String key : listImpl.keySet()) {
            System.out.println(listImpl.get(key).getFirstName()+listImpl.get(key).getSubName());
        }
	}

}
