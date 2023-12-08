package first_project;
import java.util.*;
public class ArrListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");
		
		names.set(0, "Han");
		String removed = names.remove(1);
		
		for(int i=0; i<names.size(); i++) {
			System.out.printf("%s ", names.get(i));
		}
	}

}
