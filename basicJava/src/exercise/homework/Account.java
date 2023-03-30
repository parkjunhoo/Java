package exercise.homework;


public class Account {
	
	/*
	 * -Member
	 * 
	 * accNo		계좌 번호		String	
	 * balance		계좌 잔고		int
	 * 
	 * -Getter , Setter Method
	 * getBalance
	 * getAccNo
	 * 
	 * 
	 * -Method
	 * 
	 * save			입금을 의미하는
	 * deposit		출금을 의미하는
	 * getBalance	잔고를 확인하는
	 */
	
	//계좌번호를 나타내는
	private String accNo;
	
	//잔고를 나타내는
	private int balance;
	
	//생성자
	public Account(){
		System.out.println("계좌가 개설되었습니다.");
	}
	
	
	public int getBalance() {
		return this.balance;
	}
	public String getAccNo() {
		return this.accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	
	public void save(int amount) {
		balance += amount;
		sendMessage(String.format("계좌에 %d만원이 입금되었습니다.", amount));
	}
	public void deposit(int amount) {
		balance -= amount;
		sendMessage(String.format("계좌에 %d만원이 출금되었습니다.", amount));
	}
	
	private void sendMessage(String s) {
		if(this.accNo == null) {
			System.out.println("계좌 번호 설정오류");
		}else {
			System.out.println(this.accNo+" "+s);
		}
	}
	
	
//	 public void println(String x) {
//	        if (getClass() == PrintStream.class) {
//	            writeln(String.valueOf(x));
//	        } else {
//	            synchronized (this) {
//	                print(x);
//	                newLine();
//	            }
//	        }
//	    }
//
//	@Override
//	public void println(String x) {
//		if(this.accNo !=null) x = this.accNo+" "+x;
//		if (super.getClass() == PrintStream.class) {
//            writeln(String.valueOf(x));
//        } else {
//            synchronized (this) {
//                print(x);
//                newLine();
//            }
//        }
//	}
}
