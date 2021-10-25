package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

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
			sql.append(" FROM address ORDER BY addressnum DESC ");

			rs = stmt.executeQuery(sql.toString());
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
