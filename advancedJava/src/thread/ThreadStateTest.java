package thread;

import java.util.Scanner;

class MyThread2 extends Thread{
	public void run() {
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
		for(int i =0; i<100000000; i++) {
			
		}
	}
}

public class ThreadStateTest {

	public static void main(String[] args) {
		Thread t = new MyThread2();
		System.out.println("쓰레드의 상태:"+t.getState());
		t.start();
		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
//		System.out.println("쓰레드의 상태:"+t.getState());
		//WAITTING 상태
		//join을 호출한 쓰레드의 상태를 일시정지
		try {
			t.join(); //main쓰레드는 실행이 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("쓰레드의 상태:"+t.getState());
		
	}
}
