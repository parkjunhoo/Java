package chap07.oop.inheritance.exercise;



public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class BankCustomer{
	// 문제를 잘 읽고 구현하세요.
	private String name;
	private long currentMoney;
	
	BankCustomer(String name, long currentMoney){
		this.name = name;
		this.currentMoney = currentMoney;
	}
	
	public long getCurrentMoney() {
		return this.currentMoney;
	}
	
	public void withdraw(long money) {
		if(this.currentMoney < money) {
			System.out.println("잔액이 부족하여 인출할 수 없습니다.");
			return;
		}else {
			currentMoney -= money;
		}
	}
}