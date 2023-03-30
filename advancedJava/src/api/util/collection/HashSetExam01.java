package api.util.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam01 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(90);
		set.add(88);
		set.add(77);
		set.add(100);
		int[] intArr = changeArr(set);
		for(int i : intArr) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		print(set);
		
	}
	static int[] changeArr(HashSet<Integer> set) {
		int[] arr = new int[set.size()];
		int count = 0;
		for(int i : set) {
			arr[count] = i;
			count++;
		}
		return arr;
	}
	
	static void print(HashSet<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
