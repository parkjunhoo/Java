package chap08.oop.polyinterface;

public class Chicken extends Animal implements Cheatable {
	private boolean _isFly = false;
	public Chicken() {
		
	}
	
	public Chicken(int speed) {
		super(speed);
	}
	
	public void fly() {
		this.setSpeed(this.getSpeed() * 2);
		_isFly = true;
	}

	@Override
	public void run(int hours) {
		double dis = this.getSpeed() * hours;
		this.setDistance(this.getDistance() + dis);
		
		if(_isFly) {
			System.out.println("날으는닭의 이동거리 ="+dis);
		}else {
			System.out.println("닭의 이동거리 ="+dis);
		}
		
		
	}
}
