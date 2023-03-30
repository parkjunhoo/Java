package api.util.collection;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		System.out.println("현재 벡터에 저장된 요소의 갯수 =>"+v.size());
		System.out.println("현재 벡터의 용량 =>"+v.capacity());
	}

}
