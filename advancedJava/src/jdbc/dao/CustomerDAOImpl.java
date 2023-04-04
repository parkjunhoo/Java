package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//MySQL액세스 하기 위한 기능 - Customer테이블에 대한 CL(login)RUD를 정의
public class CustomerDAOImpl implements CustomerDAO {

	private String dbUrl;
	private String dbUser;
	private String dbPassword;

	public CustomerDAOImpl() {
		this.dbUrl = "jdbc:mysql://172.30.1.60:3306/jdbc?serverTimezone=UTC";
		this.dbUser = "exam";
		this.dbPassword = "exam";
	}

	public CustomerDAOImpl(String dbUrl, String dbUser, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	public int insert(CustomerVO customer) {
		System.out.println(customer); // 검증
		Connection con = null;
		PreparedStatement ptmt = null;

		String sql = "insert into customer values(?,?,?,?,sysdate(),1000,?)";
		int result = 0;

		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			ptmt.setString(5, customer.getMemo());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt);
		}

		return result;
	}

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		Connection con = null;
		PreparedStatement ptmt = null;

		String sql = "insert into customer values(?,?,?,?,sysdate(),1000,?)";
		int result = 0;

		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, memo);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt);
		}

		return result;
	}

	@Override
	public int update(String id, int point, String pass) {
		Connection con = null;
		PreparedStatement ptmt = null;

		String sql = "update customer set point = ?, pass=? where id = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setInt(1, point);
			ptmt.setString(2, pass);
			ptmt.setString(3, id);

			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt);
		}
		return result;
	}

	@Override
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;

		String sql = "delete from customer where id = ?";
		int result = 0;

		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);

			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt);
		}
		return result;
	}

	// 변환된 레코드를 담을 자료구조
	// 레코드 하나를 VO로 변환하고
	@Override
	public ArrayList<CustomerVO> select(String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		CustomerVO customer = null;
		ArrayList<CustomerVO> customers = new ArrayList<CustomerVO>();

		String sql = "select * from customer where addr = ?";
		int result = 0;

		try {

			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, addr);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				// 조회한 레코드로 VO 객체를 만들기
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
				customers.add(customer);
				customer = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return customers;
	}

	@Override
	public CustomerVO login(String id, String pass) {

		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		CustomerVO customer = null;

		String sql = "select * from customer where id = ? and pass = ?";

		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);
			ptmt.setString(2, pass);

			rs = ptmt.executeQuery();

			if (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
			} else {
				System.out.println("일치하는 회원 정보가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return customer;

	}

	
	@Override
	public CustomerVO selectById(String id) {

		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		CustomerVO customer = null;

		String sql = "select * from customer where id = ?";

		try {
			con = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, id);

			rs = ptmt.executeQuery();

			if (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return customer;

	}
	
	
	@Override
	public ArrayList<CustomerVO> selectAll() {
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		CustomerVO customer = null;
		ArrayList<CustomerVO> customers = new ArrayList<CustomerVO>();

		String sql = "select * from customer";

		try {
			conn = DBUtil.getConnect(dbUrl, dbUser, dbPassword);
			ptmt = conn.prepareStatement(sql);

			rs = ptmt.executeQuery();
			while (rs.next()) {
				customer = new CustomerVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getInt(6), rs.getString(7));
				customers.add(customer);
				customer = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ptmt, rs);
		}

		return customers;
	}
}
