package thread;

//A~Z출력 0.5초 sleep AlphaThread

//1~100 10개출력 줄바꿈 0.1초 sleep DigitThread

//메인쓰레드 => 1번 2번 클래스 실행

class AlphaThread extends Thread{
	public void run() {
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class DigitThread extends Thread{
	public void run() {
		for(int i = 1; i<=100; i++) {
			if(i%10 == 1) System.out.println();
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExam01 {

	
	public static void main(String[] args) {
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
		Thread t1 = new AlphaThread();
		Thread t2 = new DigitThread();
		
		t1.start();
		t2.start();
		
	}

}
