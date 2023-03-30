package thread;

class MyThread extends Thread{
	public void run() {
		//시간 지연을 위한 코드 - 프로그램이 실행되는 시간을 표현
		for(int i=1; i<=2100000000; i++) {
		}
		System.out.println(getName()+"쓰레드의 우선순위->"+getPriority());
	}
}

public class ThreadPriorityTest{
	public static void main(String[] args) throws Exception{
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		
		
		System.out.println("코어수:"+Runtime.getRuntime().availableProcessors());
		for(int i=0; i<3; i++) {
			Thread t = new MyThread();
			t.start();
		}
		Thread.sleep(1000);
		for(int i=0; i<10; i++) {
			Thread t = new MyThread();
			t.setName("t"+i);
			if(i==7) {
				t.setPriority(10);
			}
			t.start();
		}
	}
}
