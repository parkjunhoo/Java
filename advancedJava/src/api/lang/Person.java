package api.lang;

public class Person {
	private String name;
	private String addr;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, String addr , int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 Person타입인지 검사
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(this.name.equals(p.name) & this.addr.equals(p.addr) & this.age == p.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	
}
