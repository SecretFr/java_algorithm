package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Connection con = null;
		Statement stmt = null;
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
			stmt = con.createStatement(); // sql문 전송객체

			StringBuffer sql = new StringBuffer();
			sql.append(" INSERT INTO address(name, handphone, address) ");
			sql.append(" VALUES('개발자10', '010-3233-1234', '중국') ");

			// insert query를 실행한 후 추가된 레코드 수를 리턴합니다.
			int cnt = stmt.executeUpdate(sql.toString());
			System.out.println("레코드 " + cnt + "개가 추가되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					System.out.println("statement 종료 ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
					System.out.println("connection 종료 ");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
