package chap07.oop.inheritance.exercise;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public Tv() {
		this.color = "black";
		this.power = false;
		this.channel = 0;
	}
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		this.channel++;
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	public void print() {
		System.out.println(String.format(
				"color :%s\tpower:%b\tchannel:%d",
				this.color , this.power , this.channel)
				);
	}
}
