package thread;

public class ThreadMethodTest {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("쓰레드이름:"+t.getName());
		System.out.println("실행중인쓰레드갯수:"+Thread.activeCount());
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread();
			System.out.println(t2.getName());
			t2.start();
		}
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread("t"+i);
			System.out.println(t2.getName());
			t2.start();
		}
		for(int i=1; i<=3; i++) {
			Thread t2 = new Thread();
			System.out.println(t2.getName());
			t2.start();
		}
		System.out.println("실행중인쓰레드갯수:"+Thread.activeCount());
		
	}

}
