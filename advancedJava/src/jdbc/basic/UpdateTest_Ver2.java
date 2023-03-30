package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class UpdateTest_Ver2 {

	public void update(String id) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = String.format("update customer set addr = '%s' where id = '%s'" , id);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loading success.");

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("connection success");

			Statement sm = conn.createStatement();

			int result = sm.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading failed.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		UpdateTest_Ver2 obj = new UpdateTest_Ver2();
		obj.update("lee");
		
	}

}
