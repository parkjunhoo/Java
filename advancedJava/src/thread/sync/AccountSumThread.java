package thread.sync;

public class AccountSumThread implements Runnable{
	Obj obj;
	
	public AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		for (int i =1; i<=5; i++) {
			synchronized(obj) {
				long total = obj.acc2.getBalance() +
						obj.acc1.getBalance();
				System.out.println("총 잔액=>"+total);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
