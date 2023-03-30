package thread.sync;

public class AcountTransferThread extends Thread{
	Obj obj;
	
	public AcountTransferThread(Obj obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		for(int i=1; i<=20; i++) {
			synchronized(obj) {
				obj.acc2.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc1.deposit(1000000);
				System.out.println("100만원을 입금했습니다.");
				try {
					Thread.sleep(333);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
