package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CloseTest {

	public void select(String addr) {
		
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "select * from customer where addr = ?";
		
		Connection conn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loading success.");

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("connection success");
			
			//Statement sm = conn.createStatement();
			psm = conn.prepareStatement(sql);
			psm.setString(1, addr);
			rs = psm.executeQuery();
			
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
		}finally {
			try {
				if(rs != null) rs.close();
				if(psm != null) psm.close();
				if(conn != null) conn.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
			
		}
	}

	public static void main(String[] args) {

		CloseTest obj = new CloseTest();
		obj.select("제천");

	}

}
