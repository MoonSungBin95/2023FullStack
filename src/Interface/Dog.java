package Interface;

public class Dog extends Mammals{
	@Override
	public void Eat() {
		System.out.println("강아지가 먹습니다.");
	}
	public void Move() {
		System.out.println("강아지가 움직입니다.");
	}
	public void Sound() {
		System.out.println("강아지가 짖습니다.");
	}
	
	public void Wait() {
		System.out.println("기다려");
	}
	public void mammaliaAction() {
		System.out.println("Baby Born");
	}
}
