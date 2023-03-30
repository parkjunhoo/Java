package algorithm.datastructure;

import java.util.Stack;

//Stack 
//한쪽 끝에서만 데이터를 넣고 뺼 수 있는 자료구조
//마지막으로 input한 데이터가 가장 먼저 output되므로
// LIFO last in first out

//push
//pop
//top  -> peek
//empty
//size
class MyStack<E>{
	public MyStack(){
		
	}
}

public class StackAPITest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("java");
		stack.push("mysql");
		stack.push("jdbc");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		
	}

}
