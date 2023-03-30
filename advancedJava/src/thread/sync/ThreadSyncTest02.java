package thread.sync;

public class ThreadSyncTest02 {

	public static void main(String[] args) {
		Obj obj = new Obj();
		obj.acc1 = new Account("111-222-333","김서연" , 10000000);
		obj.acc2 = new Account("111-222-333","BTS", 50000000);
		
		//
		AcountTransferThread t1 = new AcountTransferThread(obj);
		Thread t2 = new Thread(new AccountSumThread(obj));
		
		t1.start();
		t2.start();
	}

}
