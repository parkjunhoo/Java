package thread;

public class ThreadTest02 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("익명이너클래스");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}
}
