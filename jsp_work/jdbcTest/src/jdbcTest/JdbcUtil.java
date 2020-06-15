package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	
	public static Connection getConnection() {
		Connection conn = null;

		String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String DB_USER = "student"; 
		String DB_PASSWORD = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//			System.out.println("연결 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}     

		return conn;
	}

}
