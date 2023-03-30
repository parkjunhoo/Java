package chap08.oop.polyinterface;

public class Sales extends Employee implements Bonus{
	public Sales() {
		
	}
	public Sales(String name, int number , String department , int salary) {
		super(name,number,department,salary);
	}

	public double tax() {
		
		return this.getSalary() * 0.13;
	}
	
	@Override
	public void incentive(int pay) {
		int s = this.getSalary() + (int)(pay*1.2);
		this.setSalary(s);
	}
}
