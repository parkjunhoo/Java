package thread.sync;

public class User extends Thread{
	String name;
	Toilet toilet;
	
	
	public User(String name, Toilet toilet) {
		this.name = name;
		this.toilet = toilet;
	}
	
	public void run() {
		toilet.open(name);
	}
}
