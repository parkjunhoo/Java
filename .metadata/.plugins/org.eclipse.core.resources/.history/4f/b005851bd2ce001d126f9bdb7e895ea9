package jdbc.dao;

public class Factory {
	public CustomerDAO getDao() {
		return new CustomerDAOImpl();
	}
	public CustomerDAO getDao(String url , String user , String password) {
		return new CustomerDAOImpl(url,user,password);
	}
}
