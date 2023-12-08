package heritage;

public class InFighter extends Novice{
	
	int gage;
	
	public InFighter(String name, int hp, int gage) {
		super(name,hp);
		this.gage= gage;
		System.out.println("["+ name +"] hp : "+ hp +" gage : "+ gage);
	}
	
	public void Bigbang_Punch() {
		System.out.println("빅뱅펀치!");
	}
	
	
}
