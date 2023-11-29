package Interface;

public class Eagle extends Birds{
	public void Eat() {
		System.out.println("독수리가 먹습니다.");
	}
	public void Move() {
		System.out.println("독수리가 움직입니다.");
	}
	public void Sound() {
		System.out.println("독수리가 소리칩니다.");
	}
	
	public void Hair() {
		System.out.println("없습니다.");
	}
	void birdsAction() {
		System.out.println("Flying");
	}
}
