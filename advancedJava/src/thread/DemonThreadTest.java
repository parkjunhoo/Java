package thread;
class MyThread5 extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DemonThreadTest {

	public static void main(String[] args) {
		Thread t = new MyThread5();
		t.setDaemon(true);
		t.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}

}
