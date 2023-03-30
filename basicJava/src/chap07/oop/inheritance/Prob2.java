package chap07.oop.inheritance;


public class Prob2 {
	public static void main(String[] args){
		
		Drink coffee = new Drink("커피",1500,4);
		Drink tea = new Drink("녹차",1100,7);
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);
		
		System.out.println("***** 매 출 전 표 ***** ");
		coffee.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		
		wine.printTitle();
		wine.printData();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
