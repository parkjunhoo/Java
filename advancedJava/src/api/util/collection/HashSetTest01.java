package api.util.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("1");
		set.add("2");
		System.out.println(set);
		for(String data:set) {
			System.out.println(data);
		}
		System.out.println("=============");
		//전체 데이터를 액세스 하는 경우 표준 포맷인 Iterator로 변환
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
