package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		Shark shark = new Shark();
		
		Mammals[] mamm = new Mammals[] {dog, cat, whale};
		Fish fh = shark;
		Birds[] bd = new Birds[] {penguin, eagle};
		
		Animal[] animal = new Animal[] {dog, cat, whale, eagle, penguin, shark};
		Animal[] animal1 = new Animal[] {mamm[0], mamm[1],mamm[2],fh,bd[0],bd[1]};
		
		Waterlife[] water = new Waterlife[] {whale, penguin, shark};
		for(int i=0; i<animal.length; i++) {
			animal[i].Eat();
			animal[i].Move();
			animal[i].Sound();		
			
			if(animal[i] instanceof Dog) {
				Dog tmp = (Dog) animal[i];
				tmp.Wait();
			} else if(animal[i] instanceof Cat) {
				Cat tmp = (Cat) animal[i];
				tmp.Scratch();
			} else if(animal[i] instanceof Whale) {
				Whale tmp = (Whale) animal[i];
			}
		}
		
		for(int i=0; i<water.length; i++) {
			water[i].waterAction();
		}
	
	}

}
