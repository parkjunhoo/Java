package jdbc.basic;

import java.util.Date;

public class Member {
	
	private String id;
	private String pass;
	private String name;
	private String addr;
	private Date regdate;
	private int point;
	private String memo;

	public Member() {

	}

	public Member(String id, String pass, String name, String addr, Date regdate, String memo) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.regdate = regdate;
		this.point = 1000;
		this.memo = memo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
