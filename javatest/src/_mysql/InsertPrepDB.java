package _mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPrepDB {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Connection con = null;
		PreparedStatement pstmt = null;
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
			sql.append(" INSERT INTO address(name, handphone, address) ");
			sql.append(" VALUES(?, ?, ?) ");

			pstmt = con.prepareStatement(sql.toString()); // sql문 전송객체
			pstmt.setString(1, "joker");
			pstmt.setString(2, "123-456-7890");
			pstmt.setString(3, "India");

			// insert query를 실행한 후 추가된 레코드 수를 리턴합니다.
			int cnt = pstmt.executeUpdate();
			System.out.println("레코드 " + cnt + "개가 추가되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
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
