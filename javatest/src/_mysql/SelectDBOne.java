package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Connection con = null;
		Statement stmt = null;
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
			stmt = con.createStatement();
			StringBuffer sql = new StringBuffer();

			sql.append(" SELECT addressnum, name, handphone, address ");
			sql.append(" FROM address WHERE addressnum = 5 ");

			rs = stmt.executeQuery(sql.toString());
			if (rs.next()) {
				int addressnum = rs.getInt(1);
				String name = rs.getString(2);
				String handphone = rs.getString("handphone");
				String address = rs.getString("address");

				System.out.println("addressnum: " + addressnum);
				System.out.println("name: " + name);
				System.out.println("handphone: " + handphone);
				System.out.println("address: " + address);
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
				if (stmt != null)
					stmt.close();
				System.out.println("stmt close");
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
