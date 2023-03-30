package chap04.statement;

import java.util.Random;
import java.util.Scanner;

public class BookExercise05 {

	public static String ConvertString(int selected) {
		switch(selected) {
			case 1:
				return "가위";
			case 2:
				return "바위";
			case 3:
				return "보";
		}
		return "이상한값";
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		boolean isEnd = false;

		while (isEnd == false) {
			System.out.println("==========================");
			System.out.println("가위 : 1 , 바위: 2 , 보: 3 , 종료 : 4");
			System.out.println("==========================");
			System.out.print("선택>");
			int userSelected = s.nextInt();
			if (userSelected == 4) {
				return;
			}
			if (userSelected < 1 || userSelected > 3) {
				System.out.println("잘못 된 값 입니다.");
			} else {
				int computerSelected = r.nextInt(3) + 1;
				if (userSelected == computerSelected) {
					System.out.println("비겼습니다.");
				} else {

					switch (userSelected) {
						case 1: {
							if (computerSelected == 2) {
								System.out.println("졌습니다.");
							} else {
								System.out.println("이겼습니다.");
							}
							break;
						}
						case 2: {
							if (computerSelected == 1) {
								System.out.println("이겼습니다.");
							} else {
								System.out.println("졌습니다.");
							}
							break;
						}
						case 3: {
							if (computerSelected == 1) {
								System.out.println("졌습니다.");
							} else {
								System.out.println("이겼습니다.");
							}
							break;
						}
					}
					System.out.println(
							"Player:"+ConvertString(userSelected)+"|"+
							"Computer:"+ConvertString(computerSelected)
							);
					
				}
			}
		}
	}

}
