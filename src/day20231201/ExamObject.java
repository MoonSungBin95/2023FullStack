package day20231201;

class TestA {
	
	public boolean equals(Object obj) {
		if(obj instanceof TestA) {
			return true;
		} else
			return false;
	}
}

public class ExamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		
		TestA oba1 = new TestA();
		TestA oba2 = new TestA();
		TestA oba3 = oba1;
		
		System.out.println(oba1.toString());
		System.out.println(oba1.hashCode());
		System.out.println(oba2.toString());
		System.out.println(oba2.hashCode());
		System.out.println(oba1.equals(oba2));
		System.out.println(oba1.equals(oba3));
	}	

}
