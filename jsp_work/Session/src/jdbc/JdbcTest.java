package jdbc;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String DB_USER = "student"; // DB? userid?? pwdλ₯? ?λ§κ² λ³?κ²?
		String DB_PASSWORD = "1234";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT sysdate FROM dual"; // ??€?? ? μ§λ?? μΆλ ₯??€.
		try {
			// ??Ό?΄λ²λ?? λ‘λ©??€.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // ?°?΄?°λ² μ΄?€? ?°κ²°μ ?€? ??€.
			stmt = conn.createStatement(); // Statementλ₯? κ°?? Έ?¨?€.
			rs = stmt.executeQuery(query); // SQLλ¬Έμ ?€???€.

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
	} // main()? ?

}
