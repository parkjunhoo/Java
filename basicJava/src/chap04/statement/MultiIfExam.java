package chap04.statement;

import java.util.Scanner;

public class MultiIfExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = s.nextInt();
		String grade = "";
		if (score < 0 || score > 100) {
			System.out.println("잘못입력");
		} else {
			if (score >= 0 && score <= 59) {
				grade = "F";
			} else if (score >= 60 && score <= 69) {
				grade = "D";
			} else if (score >= 70 && score <= 79) {
				grade = "C";
			} else if (score >= 80 && score <= 89) {
				grade = "B";
			} else if (score >= 90 && score <= 100) {
				grade = "A";
			}
			System.out.println("점수:" + score + "," + grade + "학점");
		}
	}

}
