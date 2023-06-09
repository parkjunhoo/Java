package algorithm.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class MyStack {
	ArrayList<Integer> list;

	public MyStack() {
		list = new ArrayList<Integer>();
	}

	public void push(int num) {
		list.add(num);
	}

	public int pop() {
		int num = -1;
		if (list.size() > 0) {
			int i = list.size() - 1;
			num = list.get(i);
			list.remove(i);
		}
		System.out.println(num);
		return num;
	}

	public void size() {
		System.out.println(list.size());
	}

	public int empty() {
		if (list.size() > 0) {
			System.out.println(0);
			return 0;
		} else {
			System.out.println(1);
			return 1;
		}
	}

	public int top() {
		int num = -1;
		if (list.size() > 0) {
			num = list.get(list.size() - 1);
		}
		System.out.println(num);
		return num;
	}
}

public class Problem_10828 {

	public static void main(String[] args) throws Exception{
		MyStack stack = new MyStack();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine()); 
		
		for (int i = 0; i < count; i++) {
			String[] command = br.readLine().split(" ");
			switch (command[0]) {
			case "push":
				stack.push(Integer.parseInt(command[1]));
				break;
			case "pop":
				stack.pop();
				break;
			case "size":
				stack.size();
				break;
			case "empty":
				stack.empty();
				break;
			case "top":
				stack.top();
				break;

			default:
				break;
			}
		}

	}

}
