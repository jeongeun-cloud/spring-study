package jdbcTest;

import java.sql.*;

public class DAOTest1 {
	static String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	static String DB_USER = "student"; 
	static String DB_PASSWORD = "1234";

	public static void main(String[] args) {
		
		 User user = new User("ff22f","1234","남궁성","aaa@aaa.com");
	     System.out.println(user);
	}
}
