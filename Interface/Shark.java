package Interface;

public class Shark extends Fish implements Waterlife{
	
	public void Eat() {
		System.out.println("상어가 먹습니다.");
	}
	public void Move() {
		System.out.println("상어가 움직입니다.");
	}
	public void Sound() {
		System.out.println("상어가 소리칩니다.");
	}
	
	public void Sharksfin() {
		System.out.println("샥스핀");
	}
	void fishAction() {
		System.out.println("Breathe gill");
	}
	public void waterAction() {
		System.out.println("물에서만 삽니다.");
	}
}
