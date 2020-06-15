package jdbcTest;

import java.sql.*;

public class DAOTest3 {

	public static void main(String[] args) {
		
		User user = new User("aaaa","4444","홍길동","aaa@aaa.com");
		System.out.println(user);

		updateUser(user); // 객체 u에 저장된 user_id와 동일한 행의 정보를 update하는 메서드

	}
	
	static int updateUser(User u) { 
		//updateUser()메서드를 작성하시오.(PreparedStatement)
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "update user_info set password=?, name=?, email=?, up_date=? where user_id=?";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.pwd);
			pstmt.setString(2, u.name);
			pstmt.setString(3, u.email);
			pstmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
			pstmt.setString(5, u.id);
			
			pstmt.executeUpdate();
			System.out.println("user_info에 update 성공");
			
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(sql);
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


