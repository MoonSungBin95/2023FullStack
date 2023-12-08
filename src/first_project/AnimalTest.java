package first_project;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger t = new Tiger();
//		Lion l = new Lion();
//		Cat c = new Cat();
//		Dog d = new Dog();
//		Animal[] animals = {t, l, d, c};
//		for(int i=0; i< animals.length; i++) {
//			animals[i].cry();
//		}
	}

}

abstract class Animal{
	String name;
	void cry() { System.out.println("동물이 웁니다.");}
}
class Tiger extends Animal {
	void cry() { System.out.println("어흥!");}
}

