package thread;

import java.awt.Toolkit;
//익명이너클래스를 활용해서 쓰레드로 실행되도록 변경
public class BeepPrintExam {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		new Thread(new Runnable(){
			
			public void run() {
				for (int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}).start();


		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}

}
