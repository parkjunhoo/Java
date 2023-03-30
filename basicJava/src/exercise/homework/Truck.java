package exercise.homework;

public class Truck extends Wheeler{
	
	Truck(String carName ,int velocity , int wheelNumber){
		super(velocity, carName , wheelNumber);
	}
	
	public void speedUp(int speed){
		int next = this.velocity + speed * 5;
		if(next > 100) {
			next = 100;
			System.out.println("트럭의 최고속도위반으로 속도를 100으로 낮춥니다.");
		}else {
			this.velocity = next;
			System.out.println("트럭의 현재 속도는 "+this.velocity+" 입니다.");
		}
		
	}
	public void speedDown(int speed) {
		int next = this.velocity - speed * 5;
		if(next < 50) {
			next = 50;
			System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
		}else {
			this.velocity = next;
			System.out.println("트럭의 현재 속도는 "+this.velocity+" 입니다.");
		}
	}
}
