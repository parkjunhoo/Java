package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelectTest {

	public void select(String addr) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "select * from customer where addr = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loading success.");

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("connection success");
			
			//Statement sm = conn.createStatement();
			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setString(1, addr);
			ResultSet rs = psm.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.println(rs.getString(7)+"\t");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading failed.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		PreparedStatementSelectTest obj = new PreparedStatementSelectTest();
		obj.select("제천");
		
	}

}
