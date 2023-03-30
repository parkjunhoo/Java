package thread;
class MyThread4 implements Runnable{
	boolean flag;
	public void run() {
		
		while(true) {
			if(flag) {
				//Thread.yield();
			}else {
				System.out.println(Thread.currentThread().getName()+"실행");
				for(int i=0; i<100000000; i++) {
				}
			}
		}
	}
}
public class ThreadYieldTest {

	public static void main(String[] args) {
		MyThread4 obj = new MyThread4();
		Thread t1 = new Thread(obj);
		t1.setName("t1");
		obj.flag = false;
		t1.setDaemon(true); // 데몬쓰레드로 변경
		//(메인쓰레드가 종료되면 같이 종료되는 쓰레드로 변경)
		t1.start();
		
		MyThread4 obj2 = new MyThread4();
		Thread t2 = new Thread(obj2);
		t2.setName("t2");
		obj2.flag = true;
		t2.setDaemon(true);
		t2.start();
		
		for(int i =0; i<= 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.flag = !obj.flag;
			obj2.flag = !obj2.flag;
		}
	}

}
