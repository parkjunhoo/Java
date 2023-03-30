package chap04.statement;

import java.util.Scanner;

//if ~ else문
public class IfTest02 {

	public static void main(String[] args) {
		//점수 입력
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		boolean isPass;
		if(score>=90) isPass = true;
		else isPass = false;
		//boolean isPass = score>=90 ? true : false;
		
		System.out.println("점수는"+score+"점이고 , "+isPass);
	}

}
