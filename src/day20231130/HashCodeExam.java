package day20231130;

public class HashCodeExam {
	
	int id;
	String name;
	
	public HashCodeExam(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof HashCodeExam ) {
			return this.getId() == ((HashCodeExam)obj).getId();
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		   
	   HashCodeExam user2= new HashCodeExam(1001,"홍길동");
	   HashCodeExam user1= new HashCodeExam(1001,"홍길동");
	   
	   System.out.println("user1.equals(user2): " + user1.equals(user2));
	   System.out.println("user1.hashCode(): " + user1.hashCode());
	   System.out.println("user2.hashCode(): " + user2.hashCode());
	}
		
}
