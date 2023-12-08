package Interface;

public class Whale extends Mammals implements Waterlife{
	
	public void Eat() {
		System.out.println("고래가 먹습니다.");
	}
	public void Move() {
		System.out.println("고래가 움직입니다.");
	}
	public void Sound() {
		System.out.println("고래가 소리칩니다.");
	}
	
	public void Swim() {
		System.out.println("고래가 헤엄칩니다.");
	}
	public void mammaliaAction() {
		System.out.println("Baby Born");
	}
	public void waterAction() {
		System.out.println("물에서만 삽니다.");
	}
}
