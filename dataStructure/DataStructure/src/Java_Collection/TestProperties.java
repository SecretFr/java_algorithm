package Java_Collection;

import java.util.Map;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> listImpl = new Properties();
        listImpl.put("1",new NameClass("박", "석진"));
        listImpl.put("2",new NameClass("김", "석진"));
        listImpl.put("3",new NameClass("차", "석진"));
        listImpl.put("4",new NameClass("이", "석진"));
        for (Object key : listImpl.keySet()) {
            System.out.println(((NameClass) listImpl.get(key)).getFirstName()+((NameClass) listImpl.get(key)).getSubName());
        }
	}

}
