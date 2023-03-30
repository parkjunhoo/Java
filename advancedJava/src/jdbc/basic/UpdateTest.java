package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "update customer set addr = '서울특별시' where addr = '서울'";

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

}
