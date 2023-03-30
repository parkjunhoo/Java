package thread;
//Runnable 인터페이스의 하위 클래스를 작성하고 이를 이용해서
//Thread클래스를 생성하는 방법
//Runnable 인터페이스를 상속한다.
//run 메소드를 오버라이딩한다.
//쓰레드를 시작하는 곳에서
//Runnable객체를 이용해서 Thread객체를 생성
class Super{
	
}

class ThreadDemo1 extends Super implements Runnable{

	@Override
	public void run() {
		System.out.println("ststs"+Thread.currentThread().getName());
	}
}
public class RunableTest01 {
	
	public static void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		Runnable td = new ThreadDemo1();
		Thread t1 = new Thread(td,"★");
		t1.start();
		
		System.out.println("**메인쓰레드 시작**");
		for(int i =1; i<=10; i++) {
			System.out.println("main 스레드"+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("**메인쓰레드 종료**");
	}

}
