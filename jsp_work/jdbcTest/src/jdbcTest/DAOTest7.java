package jdbcTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOTest7 {
	
	public static void main(String[] args) {
		UserDao udao = UserDao.getInstance();

		List<User> list = udao.selectAllUsers();
		System.out.println(list);    
	}
}
	
//class UserDao {
//	Connection conn = JdbcUtil.getConnection();
//	PreparedStatement pstmt = null;
//	ResultSet rs = null;
//	
//	public UserDao() {
//		// TODO Auto-generated constructor stub
//	}
//
//	private static UserDao instance; // 참조변수는 지정해주지 않을 경우 null로 초기화 됨
//	public static UserDao getInstance() {
//		if(instance == null) {
//			instance = new UserDao();
//		}
//		return instance;
//	}
//	
//	int insertUser(User u) { 
//		//  insertUser()메서드를 작성하시오.(PreparedStatement)
//		String sql = "insert into user_info values(?,?,?,?,?,?)";
//		try {
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, u.id);
//			pstmt.setString(2, u.pwd);
//			pstmt.setString(3, u.name);
//			pstmt.setString(4, u.email);
//			pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
//			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
//			
//			pstmt.executeUpdate();
//			
//			System.out.println("user_info에 insert성공");
//			return 1;
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("실패");
//		}finally {
//			try {
//				pstmt.close();
//			} catch ( SQLException e ) {}
//		}
//		return -1;
//	}
//	
//	int updateUser(User u) { 
//		//updateUser()메서드를 작성하시오.(PreparedStatement)
//		
//		String sql = "update user_info set password=?, name=?, email=?, up_date=? where user_id=?";
//		try {
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, u.pwd);
//			pstmt.setString(2, u.name);
//			pstmt.setString(3, u.email);
//			pstmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
//			pstmt.setString(5, u.id);
//			
//			pstmt.executeUpdate();
//			System.out.println("user_info에 update 성공");
//			
//			return 1;
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("실패");
//		}finally {
//			try {
//				pstmt.close();
//			} catch ( SQLException e ) {}
//		}
//		
//		return 0;
//	}
//	
//	int selectUser(User u) { 
//		
//		String sql = "select * from USER_INFO where USER_ID=?";
//		try {
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, u.id);
//			
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				String id = rs.getString("USER_ID");
//				String pwd = rs.getString("PASSWORD");
//				String name = rs.getString("NAME");
//				Timestamp inDate = rs.getTimestamp("IN_DATE");
//				Timestamp upDate = rs.getTimestamp("UP_DATE");
//				
//				System.out.println(id + "||" + pwd + "||" + name + "||" + inDate + "||" + upDate);
//				return 1;
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(sql);
//			System.out.println("실패");
//		}finally {
//			try {
//				rs.close();
//				pstmt.close();
//			} catch ( SQLException e ) {}
//		}
//		
//		return 0;
//	}
//	
//	int deleteUser(String userId) {
//		// deleteUser메서드를 작성하시오.
//		
//		String sql = "delete from USER_INFO where USER_ID=?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, userId);
//			
//			pstmt.executeUpdate();
//			
//			System.out.println("delete 성공");
//			return 1;
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("delete 실패");
//		}finally {
//			try {
//				pstmt.close();
//			} catch ( SQLException e ) {}
//		}
//		
//		return 0;
//	}
//	
//	List<User> selectAllUsers() {
//		List<User> list = new ArrayList<User>();
//
//		String sql = "SELECT * FROM USER_INFO";
//		try {
//			pstmt = conn.prepareStatement(sql); 
//			rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				User user = new User();
//				user.setId(rs.getString("USER_ID"));
//				user.setPwd(rs.getString("PASSWORD"));
//				user.setName(rs.getString("NAME"));
//				user.setEmail(rs.getString("EMAIL"));
//				user.setInDate(rs.getTimestamp("IN_DATE"));
//				user.setUpDate(rs.getTimestamp("UP_DATE"));
//				
//				list.add(user);
//			}
//			System.out.println("성공7");
//			
//		} catch ( Exception e ) {
//			System.out.println("실패");
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				pstmt.close();
//			} catch ( SQLException e ) {}
//		}
//		
//		return list;
//	}
//}

