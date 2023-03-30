package chap07.oop.inheritance;

public class CheckingAccount extends Account{
	private String cardNo;
	
	CheckingAccount(String accId, String ownerName, long balance,  String cardNo){
		super(accId ,ownerName , balance);
		this.cardNo = cardNo;
	}
	
	public void pay(long amount, String cardNo) {
		if(this.cardNo != cardNo || super.getBalance() < amount) {
			System.out.println("지불이 불가능합니다.");
		}else {
			withdraw(amount);
		}
	}
}
