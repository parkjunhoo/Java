package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPIExam {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			System.out.println("큐:"+ num);
			sum += num;
		}
		System.out.println("합계:"+ sum);
	}

}
