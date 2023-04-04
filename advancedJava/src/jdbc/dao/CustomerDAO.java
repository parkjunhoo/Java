package jdbc.dao;

import java.util.ArrayList;

public interface CustomerDAO {
	int insert(CustomerVO customer);
	int insert(String id, String pass , String name, String addr , String memo);
	int update(String id , int point ,String pass);
	int delete(String id);
	ArrayList<CustomerVO> select(String addr);
	CustomerVO selectById(String id);
	ArrayList<CustomerVO> selectAll();
	CustomerVO login(String id, String pass);
	
}
