package jdbc.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class LoginTest {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아이디를 입력하세요:");
		String userId = br.readLine();
		System.out.println("비번을 입력하세요:");
		String userPass = br.readLine();
		
		
		String url = "jdbc:mysql://localhost/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = String.format("select * from customer where id = '%s' and pass = '%s' limit 1", userId , userPass);
		System.out.println(sql);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			String id = rs.getString("id");
			System.out.printf("%s님 로그인 되었습니다." , id);
		}else {
			System.out.println("일치하는 회원 정보가 없습니다.");
		}
	}

}
