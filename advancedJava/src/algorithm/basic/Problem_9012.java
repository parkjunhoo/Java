package algorithm.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_9012 {

	public static void main(String[] args) throws Exception {
		Stack<Character> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			stack.clear();
			boolean con = true;
			
			for (char c : br.readLine().toCharArray()) {
				if (c == '(') {
					stack.push(c);
				}else if(c == ')'){
					if(stack.empty()) {
						con = false;
						break;
					}else {
						stack.pop();
					}
				}
			}
			
			if(stack.empty() && con) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
