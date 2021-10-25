package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class UpdateDB {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=true&characterEncoding=utf8";
		String user = "javauser";
		String password = "1234";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();

			StringBuffer sql = new StringBuffer();
			sql.append(" UPDATE address SET ");
			sql.append(" name = 'jaewon', address = 'Seoul' ");
			sql.append(" WHERE name = '개발자10' ");

			int cnt = stmt.executeUpdate(sql.toString());
			System.out.println("recode" + cnt + "item success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					System.out.println("stmt close");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
					System.out.println("con close");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
