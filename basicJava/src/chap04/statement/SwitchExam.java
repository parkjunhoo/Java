package chap04.statement;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = s.nextInt();
		String grade = "";
		if (score < 0 || score > 100) {
			System.out.println("잘못입력");
		} else {
			
			switch(score/10) {
			case 6:
				grade = "D";
				break;
			case 7:
				grade = "C";
				break;
			case 8:
				grade = "B";
				break;
			case 9:
				grade = "A";
				break;
			case 10:
				grade = "A";
				break;
				
			default:
				grade = "F";
			}
			System.out.println("점수:" + score + "," + grade + "학점");
		}
	}

}
