package exercise.homework;

public class Emp {
	/*
	 * -Member
	 * 
	 * id			사원 번호		String	
	 * name			사원 이름		String	
	 * baseSalary	사원 기본급		int		
	 * 
	 * 
	 * -Getter , Setter Method
	 * 
	 * setName
	 * getName
	 * setBaseSalary
	 * getBaseSalary
	 * setId
	 * getId
	 * 
	 * 
	 * -Method
	 * 
	 * getSalary	보너스 값을 매개인자로 받아 봉급을 계산하여 반환하는 메소드
	 * toString		형식으로 사원정보를 리턴하는 메소드
	 */
	
	
	
	//사원 번호를 나타내는 id문자열
	private String id;
	//사원 이름을 나타내는 name문자열
	private String name;
	//사원의 기본급을 나타내는 baseSalary문자열
	private int baseSalary;
	
	//사원의 이름을 변경하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	//사원의 이름을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	//기본급을 변경하는 메소드
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	//기본급을 반환하는 메소드
	public int getBaseSalary() {
		return baseSalary;
	}
	
	//사원번호를 변경하는 메소드
	public void setId(String id) {
		this.id = id;
	}
	
	//사원번호를 반환하는 메소드
	public String getId() {
		return id;
	}
	
	
	//보너스 값을 매개인자로 받아 봉급을 계산하여 반환하는 메소드
	//salary = baseSalary + baseSalary * bonus ; 
	public double getSalary(double bonus) {
		double salary = this.baseSalary + baseSalary * bonus;
		return salary;
	}
	
	//"네임"("아이디") 사원의 기본급은 "기본급"원 입니다.
	//형식으로 사원정보를 리턴하는 메소드
	public String toString() {
		return String.format("%s(%s) 사원의 기본급은 %d원 입니다.",this.name,this.id,this.baseSalary);
	}
}
