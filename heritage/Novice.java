package heritage;

public class Novice {
	String name;
	int hp;
	int speed;
	
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("["+ name +"] hp : "+ hp);
	}
	void punch() {
		System.out.println("펀치!");
		
	}
	
	void move(String dir) {
		switch(dir) {
		case "왼쪽":
		case "left":
			System.out.println("왼쪽으로 이동합니다.");
			break;
		case "오른쪽":
		case "right":
			System.out.println("오른쪽으로 이동합니다.");
			break;
		case "위쪽":
		case "up":
			System.out.println("위쪽으로 이동합니다.");
			break;
		case "아래쪽":
		case "down":
			System.out.println("아래쪽으로 이동합니다.");
			break;
				
		}
	}
}
