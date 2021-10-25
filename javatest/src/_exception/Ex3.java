package _exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		String url = "";
		String user = "";
		String password = "";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
