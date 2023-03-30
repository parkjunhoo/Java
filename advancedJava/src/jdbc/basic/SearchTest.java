package jdbc.basic;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SearchTest {

	public static void main(String[] args) throws Exception{
		
		
		
		String url = "jdbc:mysql://localhost/jdbc?serverTimezone=UTC";
		String user = "exam";
		String password = "exam";
		String sql = "select empno , ename , job , mgr , hiredate , sal from emp "
				+ "where sal > (select avg(sal) "
				+ "from emp "
				+ "where deptno =10)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()){
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}

}
