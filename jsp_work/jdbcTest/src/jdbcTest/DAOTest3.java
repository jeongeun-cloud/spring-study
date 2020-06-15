package jdbcTest;

import java.sql.*;

public class DAOTest3 {

	public static void main(String[] args) {
		
		User user = new User("aaaa","4444","ȫ�浿","aaa@aaa.com");
		System.out.println(user);

		updateUser(user); // ��ü u�� ����� user_id�� ������ ���� ������ update�ϴ� �޼���

	}
	
	static int updateUser(User u) { 
		//updateUser()�޼��带 �ۼ��Ͻÿ�.(PreparedStatement)
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
			System.out.println("user_info�� update ����");
			
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(sql);
			System.out.println("����");
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
		
		return 0;
	}

}


