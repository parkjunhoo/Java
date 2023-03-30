package exercise.homework;

public class Sparrow {
	
	/*
	 * -Member
	 * 
	 * name		이름			String	
	 * legs		다리의 수		int
	 * length	몸길이		int
	 * 
	 * 
	 * -Getter , Setter Method
	 * setName
	 * 
	 * 
	 * -Method
	 * 
	 * fly		날다			ex:)참새(짹짹)가 날아다닙니다. 
	 * sing		울다			ex:)참새(짹짹)가 소리내어 웁니다.
	 * setName	문자열출력하기	ex:)참새의 이름은 짹짹 입니다. 
	 * 
	 */
	
	private String name;
	private int legs;
	private int length;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void fly() {
		String output = String.format("참새(%s)가 날아다닙니다.", this.name);
		System.out.println(output);
	}
	
	public void sing() {
		String output = String.format("참새(%s)가 소리내어 웁니다.", this.name);
		System.out.println(output);
	}
	
	public String toString() {
		return String.format("참새의 이름은 %s 입니다.", this.name);
	}
}
