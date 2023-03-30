package chap04.statement;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		// 요금제 별 리터당 가격
		final int GAJUNG_PERLITER = 50;
		final int SANGUP_PERLITER = 45;
		final int GONGUP_PERLITER = 30;

		// 이용요금 = 요금제리터당 가격 * 사용량
		int usedFee = 0;

		// 총수도요금 = 이용요금 + 5%의 세금
		double totalFee = 0;

		// 스캐너 s 인스턴스화
		Scanner s = new Scanner(System.in);

		System.out.println("-----Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("-----------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("-----------------------");
		// selected = 사용자가 입력한 요금제 종류
		int selected = s.nextInt();
		System.out.println("사용량을 입력하세요=>");
		int usedAmount = s.nextInt();

		// Flag ==> 1. 가정용 , 2. 상업용 , 3. 공업용
		// usedFee에 해당 요금제의 리터당 가격 * 사용량을 대입
		switch (selected) {
		case 1: {
			usedFee = GAJUNG_PERLITER * usedAmount;
			break;
		}
		case 2: {
			usedFee = SANGUP_PERLITER * usedAmount;
			break;
		}
		case 3: {
			usedFee = GONGUP_PERLITER * usedAmount;
			break;
		}

		default: {
			System.out.println("없는 요금제 입니다.");
			return;
		}
		}
		// tax = 사용요금 X 0.05 ( 5 % )
		double tax = usedFee * 0.05;

		// totalFee = 사용요금 + 세금
		totalFee = usedFee + tax;

		System.out.println("====================");
		System.out.println("사용자코드: " + selected);
		System.out.println("사용요금: " + usedFee);
		System.out.println("총수도 요금: " + totalFee);
	}

}
