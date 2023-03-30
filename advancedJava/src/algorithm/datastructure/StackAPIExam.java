package algorithm.datastructure;

import java.util.Stack;

//Stack에 1부터 10까지 데이터를 추가하고

//꺼내서 합을 출력하기
//출력형식
//스택:1
//스택:2
//....
public class StackAPIExam {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for(int i = 1 ; i<= 10; i++) {
			stack.push(i);
		}
		while(!stack.empty()) {
			int num = stack.pop();
			sum += num;
			System.out.println(num);
		}
		System.out.println("총합:"+sum);
		
	}

}
