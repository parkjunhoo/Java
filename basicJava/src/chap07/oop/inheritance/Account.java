package chap07.oop.inheritance;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account() {
		
	}
	
	public Account(String accId, String ownerName, long balance) {
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	
	
	
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public void deposit(long amount) {
		setBalance(this.balance+amount);
		//계좌에 돈을 설정하기전 처리과정이 setter에 잇을수도
	}
	public void withdraw(long amount) {
		if(amount > this.balance) {
			return;
		}else {
			setBalance(this.balance-amount);
			//계좌에 돈을 설정하기전 처리과정이 setter에 잇을수도
		}
	}
}
