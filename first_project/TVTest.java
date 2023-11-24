package first_project;


class TVTest{
	
	public static void main(String args[]) {
		
		Tv[] tv = {
				new Tv("삼성"),
				new Tv("LG"),
				new Tv("소니")
		};
		
		System.out.println("t1의 channel값은 " +tv[0].channel + "입니다.");
		System.out.println("t2의 channe2값은 " +tv[1].channel + "입니다.");
		
		tv[1] = tv[0];
		tv[0].channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " +tv[0].channel + "입니다.");
		System.out.println("t2의 channe2값은 " +tv[1].channel + "입니다.");
	}
}