package thread;
/*
 * AlphaThread2 , DigitThread2를 Runnable로 변경하여 작업하기
 */

class AlphaThread2 implements Runnable{
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

class DigitThread2 implements Runnable{
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
public class ThreadExam02 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new AlphaThread2() , "t1");
		Thread t2 = new Thread(new DigitThread2() , "t2");
		t1.start();
		t2.start();
	}

}
