package thread;

class StopThread02 implements Runnable{
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("현재 쓰레드 실행중");
			}
		}catch(Exception e) {
			
		}finally {
			System.out.println("현재 쓰레드 종료");
		}
	}
}

public class StopThreadTest2 {
/*
 * 쓰레드 종료
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기
 */
	
	public static void main(String[] args) {
		Thread t = new Thread(new StopThread02());
		t.start();
		System.out.println("쓰레드이름"+t.getName());
		System.out.println("인터럽트상태"+t.isInterrupted());
		System.out.println("인터럽트상태"+t.isInterrupted());
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
		System.out.println("인터럽트상태"+t.isInterrupted());
		System.out.println("인터럽트상태"+t.isInterrupted());
	}

}
