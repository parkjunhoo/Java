package api.util.collection;

import java.util.Date;

public class Student {
	private int num;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private Date regDate;
	
	public Student() {
		
	}

	public Student(int num, String name, int kor, int math, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.regDate = new Date();
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s", this.num, this.name , this.kor , this.math , this.eng,this.regDate);
//		return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
//				+ ", regDate=" + regDate + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	
	
	
	
}
