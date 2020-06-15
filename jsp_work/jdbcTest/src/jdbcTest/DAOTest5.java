package jdbcTest;

import java.sql.*;

public class DAOTest5 {
	static Connection conn = JdbcUtil.getConnection();
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		User user = selectUser("ff22f"); 
		System.out.println(user);

		deleteUser("ff22f"); // 객체 u에 저장된 user_id와 동일한 행의 정보를 delete하는 메서드

		user = selectUser("ff22f");
		System.out.println(user);
	}
	
	static int deleteUser(String userId) {
		// deleteUser메서드를 작성하시오.
		
		String sql = "delete from USER_INFO where USER_ID=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeUpdate();
			
			System.out.println("delete 성공");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("delete 실패");
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
		
		return 0;
	}

	private static User selectUser(String userId) {
		User user = new User();
		user.setId(userId);
		return user;
	}

}
