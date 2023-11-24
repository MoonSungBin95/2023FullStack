package first_project;

enum Direction { East, South, West, North }

public class Enumerate02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d1 = Direction.East;
		Direction d2 = Direction.valueOf("West");
		Direction d3 = Enum.valueOf(Direction.class, "East");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d1=d2 ? "+ (d1==d2));
		System.out.println("d1=d3 ? "+ (d1==d3));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
//		System.out.println("d2 > d3 ? " + (d2 > d3)); //에러
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));
		switch(d1) {
		case East:
			System.out.println("The direction is East.");
			break;
		case South:
			System.out.println("The direction is South.");
			break;
		case West:
			System.out.println("The direction is West.");
			break;
		case North:
			System.out.println("teh direction is North.");
			break;
		default:
			System.out.println("Invalid direction.");
//			break;
		}
		Direction[] dArr = Direction.values();
		for(Direction d: dArr) // for(Direction d: Direction.values())
			System.out.printf("%s%d%n", d.name(), d.ordinal());
		
		
	}

}
