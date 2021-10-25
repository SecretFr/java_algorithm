package _mysql;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 


public class DriverTestMySQL {

	public static void main(String[] args){
		Connection con = null;
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=true&characterEncoding=utf8";
		String user = "javauser";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con == null) {
				System.out.println("연결실패");
			}else {
				System.out.println("데이터베이스에 접속이 성공했습니다.");	
			}
		}
		catch(SQLException ex){ 
            System.out.println("SQLException:"+ex); 
        } 
		catch(Exception ex){ 
            System.out.println("Exception:"+ex); 
        }
		
	}

}
