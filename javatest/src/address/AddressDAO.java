package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.DBOpen;

//Data Access Object Pattern
//CRUD 처리
public class AddressDAO {
	public List<AddressDTO> list(){
		List<AddressDTO> list = new ArrayList<AddressDTO>();
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" select * from address ");
		sql.append(" order by addressnum desc ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AddressDTO dto = new AddressDTO();
				dto.setAddressnum(rs.getInt("addressnum"));
				dto.setName(rs.getString("name"));
				dto.setHandphone(rs.getString("handphone"));
				dto.setAddress(rs.getString("address"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt, rs);
		}
		
		return list;
	}
	public boolean delete(int addressnum) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" DELETE FROM address WHERE addressnum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, addressnum);
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0) flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt);
		}
		
		return flag;
		
	}
	
	public AddressDTO read(int addressnum) {
		AddressDTO dto = null;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT addressnum, name, handphone, address   ");
		sql.append(" FROM address WHERE addressnum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, addressnum);
			
			rs = pstmt.executeQuery();
			
//			System.out.println("addressnum\tname\thandphone\taddress");
			if(rs.next()) {
				dto = new AddressDTO();
				dto.setAddressnum(rs.getInt("addressnum"));
				dto.setName(rs.getString("name"));
				dto.setHandphone(rs.getString("handphone"));
				dto.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt, rs);
		}
		
		return dto;
	}
	
	public boolean create(AddressDTO dto) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" INSERT INTO address(name, handphone, address) ");
		sql.append(" VALUES(?, ?, ?) ");

		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getHandphone());
			pstmt.setString(3, dto.getAddress());

			int cnt = pstmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("레코드가 " + cnt + " 개 생성되었습니다.");
				flag = true;				
			}else {
				System.out.println("Failed!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(con, pstmt);
		}

		return flag;
	}
	
	public boolean update(AddressDTO dto) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		
		sql.append(" UPDATE address ");
		sql.append(" SET handphone=?, address=? ");
		sql.append(" WHERE addressnum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getHandphone());
			pstmt.setString(2, dto.getAddress());
			pstmt.setInt(3, dto.getAddressnum());
			
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				flag = true;
				System.out.println("레코드가 수정되었습니다.");
			}else {
				System.out.println("Update Failed!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt);
		}
		
		return flag;
	}
}
