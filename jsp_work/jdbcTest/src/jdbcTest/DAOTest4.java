package jdbcTest;

import java.sql.*;

public class DAOTest4 {

	public static void main(String[] args) {
		 User user = selectUser("ff22f");
	     System.out.println(user);
	}

	static User selectUser(String userId) {
		User user = new User();
		
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from USER_INFO where USER_ID=?";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("USER_ID");
				String pwd = rs.getString("PASSWORD");
				String name = rs.getString("NAME");
				Timestamp inDate = rs.getTimestamp("IN_DATE");
				Timestamp upDate = rs.getTimestamp("UP_DATE");
				
				System.out.println(id + "||" + pwd + "||" + name + "||" + inDate + "||" + upDate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(sql);
			System.out.println("실패");
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
		
		return user;
	}

}


