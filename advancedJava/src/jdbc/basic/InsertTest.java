package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "insert into customer values('kim','1234','김병지','제천',sysdate(),1000,'골키퍼')";
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!");
			
			// 2. DB서버 접속
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("커넥션 성공"+conn);
			
			// 3. SQL을 실행하기 위해서 Statement객체를 생성하기
			Statement stmt = conn.createStatement();
			System.out.println("Statement객체"+stmt);
			
			// 4. SQL문을 실행
			int result = stmt.executeUpdate(sql);
			
			// 5. 결과 처리
			System.out.println(result);
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
