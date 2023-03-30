package thread;

class TestThread1 extends Thread {
	public void run() {
		while(true) {
			System.out.println("1");
		}
	}
}

class TestThread2 extends Thread {
	public void run() {
		while(true) {
			Thread.yield();
			System.out.println("2");
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Thread t = new TestThread1();
		Thread t2 = new TestThread2();
		t.setDaemon(true);
		t2.setDaemon(true);
		t.start();
		t2.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
