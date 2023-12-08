package first_project;

public class Commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("args size is 0");
		}
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = "+args[i]);
		}
		
	}

}
