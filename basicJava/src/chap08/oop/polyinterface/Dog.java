package chap08.oop.polyinterface;

public class Dog extends Animal {
	
	public Dog() {
		
	}
	
	Dog(int speed){
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		double dis = (this.getSpeed() * hours) * 0.5;
		this.setDistance(this.getDistance() + dis);
		System.out.println("개의 이동거리 ="+dis);
	}
}
