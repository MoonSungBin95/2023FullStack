package Interface;

public class Cat extends Mammals{
	@Override
	public void Eat() {
		System.out.println("고양이가 먹습니다.");
	}
	public void Move() {
		System.out.println("고양이가 움직입니다.");
	}
	public void Sound() {
		System.out.println("고양이가 소리칩니다.");
	}
	
	public void Scratch() {
		System.out.println("할퀴기");
	}
	public void mammaliaAction() {
		System.out.println("Baby Born");
	}
}
