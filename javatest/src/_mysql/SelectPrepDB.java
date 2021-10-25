package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectPrepDB {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=true&characterEncoding=utf8";
		String user = "javauser";
		String password = "1234";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver).newInstance();

		} catch (ClassNotFoundException e) {
			System.err.print(e.toString());
		}

		try {
			con = DriverManager.getConnection(url, user, password);
			StringBuffer sql = new StringBuffer();
			
			sql.append(" SELECT addressnum, name, handphone, address ");
			sql.append(" FROM address WHERE name = ? AND address = ? ");

			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, "개발자6");
			pstmt.setString(2, "미국");
//			pstmt.setString(1, "개발자2");
//			pstmt.setInt(1, 8);
			
			rs = pstmt.executeQuery();
			System.out.println("addressnum\tname\thandphone\taddress");
			while (rs.next()) {
				int addressnum = rs.getInt(1);
				String name = rs.getString(2);
				String handphone = rs.getString("handphone");
				String address = rs.getString("address");

				System.out.print(addressnum + "\t");
				System.out.print("\t" + name);
				System.out.print("\t" + handphone);
				System.out.print("\t" + address);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				System.out.println("rs close");
			} catch (Exception e) {

			}
			try {
				if (pstmt != null)
					pstmt.close();
				System.out.println("pstmt close");
			} catch (Exception e) {

			}
			try {
				if (con != null)
					con.close();
				System.out.println("con close");
			} catch (Exception e) {

			}
		}

	}

}
