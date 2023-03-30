package chap11.exception;

public class CheckingAccount extends Account{
	private String cardNo;
	
	CheckingAccount(String accId, String ownerName, long balance,  String cardNo){
		super(accId ,ownerName , balance);
		this.cardNo = cardNo;
	}
	
	public void pay(long amount, String cardNo) {
		if(this.cardNo != cardNo || super.getBalance() < amount) {
			//잔액이 부족한 경우 Exception이 발생할 수 있도록 처리하기
			//BankException을 만들어서 처리하기 - 마이익셉션과 동일
			try {
				throw new BankException("잔액이 부족합니다.", super.getBalance() , amount);
			}catch(BankException e) {
				System.out.println(e.getMessage());
				System.out.println(e.bal+","+ e.amount);
			}
			//System.out.println("지불이 불가능합니다.");
		}else {
			withdraw(amount);
		}
	}
}
