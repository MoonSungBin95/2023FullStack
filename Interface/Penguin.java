package Interface;

public class Penguin extends Birds implements Waterlife{
	public void Eat() {
		System.out.println("펭권이 먹습니다.");
	}
	public void Move() {
		System.out.println("펭권이 움직입니다.");
	}
	public void Sound() {
		System.out.println("펭권이 소리칩니다.");
	}
	
	public void Attack() {
		System.out.println("부리로 쫍니다.");
	}
	void birdsAction() {
		System.out.println("Flying");
	}
	public void waterAction() {
		System.out.println("물에서만 삽니다.");
	}
}
