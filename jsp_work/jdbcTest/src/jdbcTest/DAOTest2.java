package jdbcTest;

import java.sql.*;

public class DAOTest2 {

	public static void main(String[] args) {
		
		 User user = new User("ff22f","1234","남궁성","aaa@aaa.com");
	     System.out.println(user);
	     
	     insertUser(user);  // 객체 u에 저장된 값을 DB의 user_info테이블에 insert하는 메서드

	}
	
	static int insertUser(User u) { 
		//  insertUser()메서드를 작성하시오.(PreparedStatement)
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into user_info values(?,?,?,?,?,?)";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.id);
			pstmt.setString(2, u.pwd);
			pstmt.setString(3, u.name);
			pstmt.setString(4, u.email);
			pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			
			pstmt.executeUpdate();
			
			System.out.println("user_info에 insert성공");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("실패");
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
		
		return 0;
	}

}


