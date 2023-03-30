package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionExam {
	public void arrayPrint(ArrayList<Board> list) {
		for(Board b : list) {
			System.out.println(b.toString());
		}
	}
	public void setPrint(HashSet<Board> set) {
		for(Board b : set) {
			System.out.println(b.toString());
		}
	}
	public void mapPrint(HashMap<Integer,Board> map) {
		Set<Integer> keys = map.keySet();
		for(int key : keys) {
			System.out.println(map.get(key).toString());
		}
	}

}
