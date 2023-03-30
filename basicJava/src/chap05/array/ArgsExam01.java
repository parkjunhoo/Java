package chap05.array;

import java.util.Random;

public class ArgsExam01 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("잘못된입력값");
			System.exit(0);
		}
		
		switch(args[0]) {
			case "int":{
				Random r = new Random();
				int[] intArr = new int[5];
				for(int i =0; i<intArr.length; i++) {
					intArr[i] = r.nextInt(10)+1;
					System.out.println(intArr[i]);
				}
				
				break;
			}
			case "String":{
				String[] strArr = new String[3];
//				for(int i =0; i<strArr.length; i++) {
//					strArr[i] = "java";
//					System.out.println(strArr[i]);
//				}
				for(String str : strArr) {
					str = "java";
					System.out.println(str);
				}
				
				break;
			}
			
			default:{
				System.out.println("잘못된입력값");
				System.exit(0);
			}
		}
	}

}
