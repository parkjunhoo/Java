package chap07.oop.polymorphism;


public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
		
	}
	
	//Beverage배열에 저장된 판매상품의 종류별 갯수를 구해서 출력하세요
	public static void printAmount(Beverage[] beverage) {
		int coffee_amount = 0;
		int tea_amount = 0;
		
		for(Beverage product : beverage) {
			if(product instanceof Coffee) {
				coffee_amount++;
			}else {
				tea_amount++;
			}
		}
		
		System.out.println("Coffee의 갯수"+coffee_amount);
		System.out.println("Tea의 갯수"+coffee_amount);
	}
	
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
	
	public static void getSalesInfo(Beverage[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i].calcPrice();
			System.out.println(String.format(
					"%d 번째 판매 음료는 %s 이며, 가격은 %d",
					i+1 , arr[i].getName() , arr[i].getPrice()));
		}
	}
	
	
	
	
	
	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
	public static int getTotalPrice(Beverage[] arr) {
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i].getPrice();
		}
		return sum;
	}
}
