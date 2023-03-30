package api.util.collection;

import java.util.ArrayList;

public class ArrayListExam03 {

	public static void main(String[] args) {
		/*
		 *  번호	성명		국어		수학		영어
		 *  1	장동건	100		99		88
		 *  2	이민호	89		100		100
		 *  3	김범룡	95		89		100
		 *  
		 *  제목빼고 데이터만 ArrayList에 저장하기
		 */
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> j = new ArrayList<String>();
		j.add("장동건");
		j.add("100");
		j.add("99");
		j.add("88");
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("이민호");
		l.add("89");
		l.add("100");
		l.add("100");
		
		ArrayList<String> k = new ArrayList<String>();
		k.add("김범룡");
		k.add("95");
		k.add("89");
		k.add("100");
		
		list.add(j);
		list.add(l);
		list.add(k);

		display(list);
	}

	//1. 데이터를 ArrayList에 저장하기
	//2. ArrayList에 저장된 모든 데이터를 위와 같은 형식으로 출력하기
	//2. 1번2번이 끝나면 제출
	
	//3. 출력하는 부분만 메소드로 분리
	//메소드명 : display
	//리턴타입은 void
	//매개변수 ArrayList<ArrayList<String>>
	public static void display(ArrayList<ArrayList<String>> list) {
		for(int x =0; x<list.size(); x++) {
			for(int y =0; y<list.get(x).size(); y++) {
				System.out.printf("%s\t" , list.get(x).get(y));
			}
			System.out.println();
		}
	}
}
