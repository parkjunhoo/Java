package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdateTest {

	public void update(String addr , String id) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "update customer set addr = ? where id = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loading success.");

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("connection success");

			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setString(1, addr);
			psm.setString(2, id);

			int result = psm.executeUpdate();
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading failed.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		PreparedStatementUpdateTest obj = new PreparedStatementUpdateTest();
		obj.update("부산", "lee");
		
	}

}
