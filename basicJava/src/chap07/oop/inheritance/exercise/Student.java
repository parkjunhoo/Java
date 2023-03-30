package chap07.oop.inheritance.exercise;


public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
	
	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	
	public boolean calcReturnFee() {
		if(this.subject.equals("javaprogram")) {
			this.returnFee = fee * 0.25;
		}else if(this.subject.equals("jspprogram")) {
			this.returnFee = fee * 0.2;
		}else {
			System.out.println("그런 과정명은 없습니다.");
			return false;
		}
		return true;
	}
	
	public void print() {
		System.out.println(
				String.format(" %s씨의 과정명은 %s이고 교육비는 %d이고 환급금는 %f 입니다.",
				this.name, this.subject, this.fee, this.returnFee)
				);
	}
	
	public static void main(String args[]) {
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
		
		Student stu2 = new Student(args[0],args[1],Integer.parseInt(args[2]));
		
		if(stu2.calcReturnFee()) {
			stu2.print();
		}
	}
}