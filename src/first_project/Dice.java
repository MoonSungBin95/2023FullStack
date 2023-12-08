package first_project;
import java.util.*;
public class Dice {
	int sides;
	static Random rand = new Random();
	
	Dice(int num){
		sides = num;
	}
	
	public int Roll() {
		return rand.nextInt(sides)+1;
	}
	
}

