package thread.sync;
//모든 쓰레드가 공유해서 사용하는 객체
public class Toilet {
	public static boolean _lock = false;
	//synchronized 메소드 앞에 정의하면 lock
	
	//synchronized(공유객체){
	//	동시 접속에 대한 처리를 하고 싶은 코드를 정의	
	//}
	
	public void open(String name) { //name은 공유객체를 사용하는 쓰레드의 이름
		
		while(_lock) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		_lock = true;
		System.out.println(name+"이 문열고 들어옴");
		for(int i =0; i<=100000000; i++) {
			if(i==10000) System.out.println(name+"이 끙~~아");
		}
		System.out.println(name+"이 문열고 나감");
		_lock = false;

	}
}
