package thread;
/*
 * 한 번 start된 쓰레드는 절대 다시 실행할 수 없다.
 * => 일회용
 * 쓰레드를 종료
 * 1. 임의의 변수를 선언해서 종료하는 방법
 */

class StopThread extends Thread{
	private boolean state = true;
	public void run() {
		while(true) {
			if(state) {
				System.out.println("현재 쓰레드의 상태:실행중~~~");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				Thread.yield();
			}
		}
	}
	
	//쓰레드의 현재 상태를 조절할 수 있는 변수를 변경할 수 있는 메소드
	public void stopThread() {
		System.out.println("현재 쓰레드의 상태: 종료상태");
		state = false;
	}
	
	public void startThread() {
		state = true;
	}
}
public class StopThreadTest01 {

	public static void main(String[] args) {
		Thread t = new StopThread();
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		((StopThread)t).stopThread();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		((StopThread)t).startThread();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((StopThread)t).stopThread();
	}

}
