package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//MySQL액세스 하기 위한 기능 - Customer테이블에 대한 CL(login)RUD를 정의
public class CustomerDAOImpl_JSON implements CustomerDAO {

	@Override
	public int insert(CustomerVO customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(String id, String pass, String name, String addr, String memo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String id, int point, String pass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CustomerVO> select(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVO selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
