package chap08.oop.polyinterface;


public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Cheatable){
			cheatableChicken.fly();
		}
		
		for(int i =1; i<=3; i++) {
			System.out.println(i+"시간 후");
			dog.run(i);
			chicken.run(i);
			cheatableChicken.run(i);
		}
	}
}












