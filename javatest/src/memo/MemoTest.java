package memo;

import java.util.List;

import address.AddressDTO;

public class MemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoDAO dao = new MemoDAO();
//		read(dao);
		list(dao);
	}

	private static void list(MemoDAO dao) {
		// TODO Auto-generated method stub
		List<MemoDTO> list = dao.list();
		for(int i=0; i<list.size(); i++) {
			MemoDTO dto = list.get(i);
			p(dto);
			p("---------------------------------------------");
		}
	}

	private static void read(MemoDAO dao) {
		// TODO Auto-generated method stub
		MemoDTO dto = new MemoDTO();
		dto.setMemonum(4);
		dto = dao.read(dto.getMemonum());
		p(dto);
	}
	
	private static void p(MemoDTO dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.toString());
	}
	
	private static void p(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
