package jdbc.dao;

public interface CustomerDAO {
	int insert(String id, String pass , String name, String addr , String memo);
	int update(String id , int point ,String pass);
	int delete(String id);
	int select(String addr);
	int login(String id, String pass);
	
}
