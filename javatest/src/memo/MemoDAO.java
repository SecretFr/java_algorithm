package memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import address.AddressDTO;
import utility.DBClose;
import utility.DBOpen;

public class MemoDAO {
	public List<MemoDTO> list(){
		List<MemoDTO> list = new ArrayList<MemoDTO>();
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" select * from memo ");
		sql.append(" order by memonum desc ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemoDTO dto = new MemoDTO();
				dto.setMemonum(rs.getInt("memonum"));
				dto.setName(rs.getString("name"));
				dto.setContent(rs.getString("content"));
				dto.setPass(rs.getString("pass"));
				
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
	
	public MemoDTO read(int memonum) {
		MemoDTO dto = null;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" SELECT memonum, name, content, pass ");
		sql.append(" FROM memo WHERE memonum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, memonum);
			
			rs = pstmt.executeQuery();
			
//			System.out.println("addressnum\tname\thandphone\taddress");
			if(rs.next()) {
				dto = new MemoDTO();
				dto.setMemonum(rs.getInt("memonum"));
				dto.setName(rs.getString("name"));
				dto.setContent(rs.getString("content"));
				dto.setPass(rs.getString("pass"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt, rs);
		}
		
		return dto;
	}
	
	public boolean delete(int memonum) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" DELETE FROM memo WHERE addressnum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, memonum);
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0) flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBClose.close(con, pstmt);
		}
		
		return flag;
		
	}
	
	public boolean create(MemoDTO dto) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();

		sql.append(" INSERT INTO address(name, content, pass) ");
		sql.append(" VALUES(?, ?, ?) ");

		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getPass());

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
	
	public boolean update(MemoDTO dto) {
		boolean flag = false;
		Connection con = DBOpen.open();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		
		sql.append(" UPDATE memo ");
		sql.append(" SET name=?, pass=? ");
		sql.append(" WHERE memonum=? ");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPass());
			pstmt.setInt(3, dto.getMemonum());
			
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
