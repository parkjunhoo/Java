package thread;

//네트워크로 데이터를 받아오는 쓰레드
class Thread3_1 implements Runnable{
	public void run() {
		for(int i=0; i<1000000000; i++) {
			
		}
	}
}

//Thread3_1에서 받아온 데이터를 이용해서 처리를 하는 쓰레드
class Thread3_2 implements Runnable {
	Thread t;
	public Thread3_2(Thread t) {
		super();
		this.t = t;
	}
	public void run() {
		try {
			//Thread3_2가 Thread3_1작업 후에
			//처리를 해야 하거나 3_1에서 발생된 결과를 갖고 실행해야하는 경우
			t.join(3000);
			//Thread.sleep(3000);
			System.out.println("3초경과");
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("======인터럽트가 발생~~~~=======");
		}
		for(int i=0; i<100000000; i++) {
			
		}
	}
}

public class ThreadJoinTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread3_1());
		Thread t2 = new Thread(new Thread3_2(t1));
		t1.start();
		t2.start();
		
		//인터럽트
		//=> t2
		System.out.println("t1상태"+t1.getState());
		System.out.println("t2상태"+t2.getState());
		
		//t2.interrupt();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("t1상태"+t1.getState());
		System.out.println("t2상태"+t2.getState());
	}

}
