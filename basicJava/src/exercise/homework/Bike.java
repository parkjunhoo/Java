package exercise.homework;

public class Bike extends Wheeler{
	Bike(String carName ,int velocity , int wheelNumber){
		super(velocity, carName , wheelNumber);
	}
	
	public void speedUp(int speed){
		int next = this.velocity + speed;
		if(next > 40) {
			next = 40;
			System.out.println("자전거의 최고속도위반으로 속도를 40으로 낮춥니다.");
		}else {
			this.velocity = next;
			System.out.println("자전거의 현재 속도는 "+this.velocity+" 입니다.");
		}
		
	}
	public void speedDown(int speed) {
		int next = this.velocity - speed;
		if(next < 10) {
			next = 10;
			System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
		}else {
			this.velocity = next;
			System.out.println("자전거의 현재 속도는 "+this.velocity+" 입니다.");
		}
	}
}
