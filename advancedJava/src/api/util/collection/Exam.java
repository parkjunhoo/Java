package api.util.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Date;

public class Exam {

	public static void main(String[] args) {
		ArrayList<Board> list = new ArrayList<Board>();
		HashSet<Board> set = new HashSet<Board>();
		HashMap<Integer,Board> map = new HashMap<Integer,Board>();
	
		for(int i=0; i<5; i++) {
			Board b = new Board(i,"junhoo",i+"번째글",new Date(), "반갑습니다"+i);
			list.add(b);
			set.add(b);
			map.put(b.getNum(), b);
		}
		
		CollectionExam c = new CollectionExam();
		c.arrayPrint(list);
		System.out.println("=========================================");
		c.mapPrint(map);
		System.out.println("=========================================");
		c.setPrint(set);
	}
}
