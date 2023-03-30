package chap06.oop.basic;

abstract class Human {
	protected String name;
	protected int age;

	///////////////////////////////
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	///////////////////////////////
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	///////////////////////////////

	public void print() {
		System.out.println(String.format("이  름 : %s\t나 이 : %d\t"+addMoreInfo(),this.name , this.age));
	};
	
	protected abstract String addMoreInfo();
	
}
