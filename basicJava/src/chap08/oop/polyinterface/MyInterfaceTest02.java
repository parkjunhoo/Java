package chap08.oop.polyinterface;
interface ParentInterA{
	void testA();
}
interface ParentInterB{
	void testB();
}
class SuperClass {
	public void display() {
		System.out.println("SUPER-CLASS");
	}
}

class ChildClass extends SuperClass implements ParentInterA , ParentInterB{
	public void testA() {
		
	}
	public void testB() {
		
	}
}

public class MyInterfaceTest02 {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		ParentInterA obj2 = new ChildClass();
		ParentInterB obj3 = new ChildClass();
		SuperClass obj4 = new ChildClass();
		
	}

}
