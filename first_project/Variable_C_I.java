package first_project;

class Student {
	static int count = 0;
	
	int id;
	String name;
	
	Student(int _id, String _name) {
		Student.count++;
		id = _id;
		name = _name;
	}
}

public class Variable_C_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student park = new Student(2019122104, "Park");
		Student kim = new Student(2019206028, "kim");
		Student lee = new Student(2019153237, "Lee");
		System.out.printf("Student 객체의 수: %d", Student.count);
		
	}

}
