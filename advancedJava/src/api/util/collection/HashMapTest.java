package api.util.collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
//map도 순서가 없는 자료구조 key의 값으로 저장될 위치를 계산해서 저장되기 때문에 추출했을때 순서대로 나오지 않는다.
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("a01", 100);
		map.put("a02", 100);
		map.put("a03", 100);
		map.put("a04", 100);
		map.put("a05", 400);
		Set<String> keyList = map.keySet();
		for(String key : keyList) {
			System.out.print(key+":");
			System.out.println(map.get(key));
		}
//		map.forEach((String k , Integer v)->{
//			
//		});
	}

}
