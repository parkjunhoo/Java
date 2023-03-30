package chap07.oop.polymorphism;

public class SenderLogic {
	// Sender관련된 기능을 호출해서 처리하는 메소드
	public void run(Sender s) {
		s.send();
	}
	public void exe(Sender s) {
		s.send();
		s.send();
	}
}
