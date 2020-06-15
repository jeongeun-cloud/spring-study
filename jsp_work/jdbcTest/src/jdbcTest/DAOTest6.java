package jdbcTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOTest6 {

	public static void main(String[] args) {
		List<User> list = selectAllUsers();

		System.out.println(list);
	}
	
	static List<User> selectAllUsers() {
		List<User> list = new ArrayList<User>();

		Connection conn = JdbcUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM USER_INFO";
		try {
			pstmt = conn.prepareStatement(sql); 
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getString("USER_ID"));
				user.setPwd(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setEmail(rs.getString("EMAIL"));
				user.setInDate(rs.getTimestamp("IN_DATE"));
				user.setUpDate(rs.getTimestamp("UP_DATE"));
				
				list.add(user);
			}
			
			System.out.println("성공");
			
		} catch ( Exception e ) {
			System.out.println("실패");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
		
		return list;
	}
}