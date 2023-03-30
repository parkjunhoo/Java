package api.util.collection;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		System.out.println("현재 벡터에 저장된 요소의 갯수 =>"+list.size());
	}

}
