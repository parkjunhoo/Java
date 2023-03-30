package api.lang;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("BTS" , "서울" , 30);
		Person p2 = new Person("BTS" , "서울" , 30);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.getClass());
	}

}
