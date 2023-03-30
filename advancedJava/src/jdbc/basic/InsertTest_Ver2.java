package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest_Ver2 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		InsertTest_Ver2 obj = new InsertTest_Ver2();
		
		System.out.print("아이디:");
		String id = key.next();
		
		System.out.print("패스워드:");
		String pass = key.next();
		
		System.out.print("이름:");
		String name = key.next();
		
		System.out.print("주소:");
		String addr = key.next();
		
		System.out.print("메모:");
		String memo = key.next();
		
		obj.insert(id,pass,name,addr,memo);
	}
	
	public void insert(String id , String pass ,String name, String addr , String memo) {
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = String.format("insert into customer values('%s','%s','%s','%s',sysdate(),1000,'%s')", id,pass,name,addr,memo);
		
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
