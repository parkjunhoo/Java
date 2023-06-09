package algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPITest {
/*
 * rear : 큐의 가장 끝쪽 데이터가 삽입된 위치
 * front : 큐의 가장 앞쪽 데이터가 삽입된 위치
 * add : 큐의 rear에 데이터를 삽입
 * poll : front 부분에 저장된 데이터를 삭제
 * peek : 큐의 맨 앞 부분 , front에 있는 부분 보기
 */
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.offer(2);
		queue.remove();
		queue.peek();
	}

}
