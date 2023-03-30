package api.lang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ObjectTest {
	//equal는 하위클래스에서 객체의 속성을 비교교해서
	//같은 객체인지 여부를 bool형태로 리턴하도록 재정의
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1==obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(obj1.equals(obj2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		//hashCode는 객체가 할당된 메모리를 기준으로
		//값을 계산해서 리턴하므로 모두 다른 값을 리턴
		System.out.println(obj1.hashCode());
		
		//getClass
		System.out.println(obj1.getClass());
		
		Date d = new Date();
		System.out.println(d);
		
		String str = new String("java");
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("servlet");
		System.out.println(list);
		
		Random rand = new Random();
		System.out.println(rand);
	}

}
