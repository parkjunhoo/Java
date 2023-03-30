package api.util.collection;

import java.util.Vector;

public class VectorExam01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(78);
		v.add(99);
		v.add(100);
		v.add(95);
		v.add(100);
		
		int sum = 0;
		float avg = 0;
		for(int i=0; i<v.size(); i++) {
			sum += v.get(i);
		}
		avg = sum / 5f; 
		System.out.println("총점"+sum+"|"+"평균"+avg);
	}

}
