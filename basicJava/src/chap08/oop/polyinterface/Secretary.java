package chap08.oop.polyinterface;

public class Secretary extends Employee implements Bonus{
	public Secretary() {
		
	}
	public Secretary(String name, int number , String department , int salary) {
		super(name,number,department,salary);
	}

	public double tax() {
		
		return this.getSalary() * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		int s = this.getSalary() + (int)(pay*0.8);
		this.setSalary(s);
	}
	

}
