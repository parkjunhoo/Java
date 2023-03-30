package thread;
//Thread클래스를 상속 받아 작업

//Runnable 인터페이스의 하위 클래스를 작성하고 이를 이용해서
//Thread클래스를 생성하는 방법
class ThreadDemo01 extends Thread{
	static int num = 0;
	
	public ThreadDemo01(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 1 ; i<=10; i++) {
			num++;
			System.out.println(i+this.getName()+num);
		}
	}
	
}

public class ThreadTest01 {
	public static void main(String[] args) {
		ThreadDemo01 t1 = new ThreadDemo01("★");
		ThreadDemo01 t2 = new ThreadDemo01("♣");
		t1.start();
		t2.start();
//		System.out.println("****메인쓰레드 시작****");
//		
//		for(int i =0; i<=10; i++) {
//			System.out.println("main쓰레스");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("****메인쓰레드 종료****");
	}

}
