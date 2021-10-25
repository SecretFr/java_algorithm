package address;

import java.util.List;

public class AddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressDAO dao = new AddressDAO();
//		create(dao);
//		read(dao);
//		update(dao);
//		delete(dao);
		list(dao);
	}

	private static void list(AddressDAO dao) {
		// TODO Auto-generated method stub
		List<AddressDTO> list = dao.list();
		for(int i=0; i<list.size(); i++) {
			AddressDTO dto = list.get(i);
			p(dto);
			p("---------------------------------------------");
		}
		
	}

	private static void delete(AddressDAO dao) {
		AddressDTO dto = new AddressDTO();
		dto.setAddressnum(14);
		if(dao.delete(dto.getAddressnum())) {
			p("성공");
			dto = dao.read(14);
			p(dto);
		}else {
			p("실패");
		}
		
	}

	private static void update(AddressDAO dao) {
		// TODO Auto-generated method stub
		AddressDTO dto = new AddressDTO();
		dto.setHandphone("010-0001-0003");
		dto.setName("Hogu");
		dto.setAddressnum(14);

		if (dao.update(dto)) {
			p("성공");
			dto = dao.read(14);
			p(dto);
		} else {
			p("실패");
		}
	}

	private static void read(AddressDAO dao) {
		// TODO Auto-generated method stub
//		AddressDTO dto = dao.read(7);
		AddressDTO dto = new AddressDTO();
		dto.setAddressnum(7);
		dto = dao.read(dto.getAddressnum());
		p(dto);

	}

	private static void create(AddressDAO dao) {
		// TODO Auto-generated method stub
		AddressDTO dto = new AddressDTO();
		dto.setName("김길동12");
		dto.setHandphone("010-2232-2222");
		dto.setAddress("서울시 강남구");
		System.out.println(dto.toString());
		if (dao.create(dto)) {
			p("성공");
		} else {
			p("실패");
		}
	}

	private static void p(AddressDTO dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.toString());
	}

	private static void p(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
