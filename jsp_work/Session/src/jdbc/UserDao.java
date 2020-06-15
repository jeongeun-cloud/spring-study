package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


class Dao {
	Connection conn;
	String tableName = "";

	Dao() {
		this(null, "");
	}

	Dao(String tableName) {
		this(null, tableName);
	}

	Dao(Connection conn, String tableName) {
		this.tableName = tableName;
		this.conn = conn;

		if(conn==null) {
			this.conn = JdbcUtil.getConnection();
		}
	}

	void rollback(){
		if(conn!=null) {
			try {
				conn.rollback();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	void close(AutoCloseable... acs) {
		try {
			for(AutoCloseable ac : acs) {
				if(ac!=null) ac.close();
			}
		} catch(Exception e) {}
	}
	
} // Dao 끝

public class UserDao extends Dao {
		
	Connection conn = JdbcUtil.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	UserDao() {
		super(null, "USER_INFO");
	}
	
	UserDao(Connection conn) {
		super(conn, "USER_INFO");
	}
	
	private static UserDao instance; // 참조변수는 지정해주지 않을 경우 null로 초기화 됨
	public static UserDao getInstance() {
		if(instance == null) {
			instance = new UserDao();
		}
		return instance;
	}
	
	public int insertUser(User u) { 
		//  insertUser()메서드를 작성하시오.(PreparedStatement)
		int result = 0;
		String sql = "insert into "+ tableName +" values(?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPwd());
			pstmt.setString(3, u.getName());
			pstmt.setString(4, u.getEmail());
			pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int updateUser(User u) { 
		//updateUser()메서드를 작성하시오.(PreparedStatement)
		int result = 0;
		String sql = "update user_info set password=?, name=?, email=?, up_date=? where user_id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getPwd());
			pstmt.setString(2, u.getName());
			pstmt.setString(3, u.getEmail());
			pstmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
			pstmt.setString(5, u.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public User selectUser(String userId) { 
		User user = null;
		
		String sql = "select * from "+ tableName +" where USER_ID=?";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("USER_ID");
				String pwd = rs.getString("PASSWORD");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Timestamp inDate = rs.getTimestamp("IN_DATE");
				Timestamp upDate = rs.getTimestamp("UP_DATE");
				
				user = new User(id, pwd, name, email, inDate, upDate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs, pstmt);
		}
		
		return user;
	}
	
	public int deleteUser(String userId) {
		// deleteUser메서드를 작성하시오.
		int result = 0;
		String sql = "delete from " + tableName + " where USER_ID=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int deleteAll() {
		int result = 0;
		String sql = "delete from " + tableName;
		
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public List<User> selectAllUsers() {
		List<User> list = new ArrayList<User>();

		String sql = "SELECT * FROM " + tableName;
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
			
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			close(rs, pstmt);
		}
		
		return list;
	}
}