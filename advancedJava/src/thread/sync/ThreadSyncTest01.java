package thread.sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		//쓰레드에서 공유할 객체를 생성
		Toilet toilet = new Toilet();
		//공유객체를 사용하며 실핼될 쓰레드 생성
		User user1 = new User("김민재" , toilet);
		User user2 = new User("손흥민" , toilet);
		User user3 = new User("케인" , toilet);
		User user4 = new User("무사디아비" , toilet);
		User user5 = new User("라파엘바란" , toilet);
		User user6 = new User("차두리" , toilet);
		User user7 = new User("메시" , toilet);
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
		
	}

}
