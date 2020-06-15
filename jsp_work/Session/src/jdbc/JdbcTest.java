package jdbc;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String DB_USER = "student"; // DB?˜ userid?? pwdë¥? ?•Œë§ê²Œ ë³?ê²?
		String DB_PASSWORD = "1234";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT sysdate FROM dual"; // ?‹œ?Š¤?…œ?˜ ?‚ ì§œë?? ì¶œë ¥?•œ?‹¤.
		try {
			// ?“œ?¼?´ë²„ë?? ë¡œë”©?•œ?‹¤.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // ?°?´?„°ë² ì´?Š¤?˜ ?—°ê²°ì„ ?„¤? •?•œ?‹¤.
			stmt = conn.createStatement(); // Statementë¥? ê°?? ¸?˜¨?‹¤.
			rs = stmt.executeQuery(query); // SQLë¬¸ì„ ?‹¤?–‰?•œ?‹¤.

			while (rs.next()) {
				String curDate = rs.getString(1);
				System.out.println(curDate);
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch ( SQLException e ) {}
		}
	} // main()?˜ ?

}
