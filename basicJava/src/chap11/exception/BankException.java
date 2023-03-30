package chap11.exception;

public class BankException extends Exception{
	public long bal;
	public long amount;
	public BankException(String msg, long bal , long amount) {
		super(msg);
		this.bal = bal;
		this.amount = amount;
	}
}
