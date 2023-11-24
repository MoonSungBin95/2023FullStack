package first_project;

public class Tv {
	String color;
	boolean power;
	int channel;
	String brand = "";
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}

	public Tv(String name) {
		this.brand = name;
	
	}
}
