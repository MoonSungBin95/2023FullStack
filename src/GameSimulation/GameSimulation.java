package GameSimulation;

public class GameSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knight atomic = new Knight("아토믹");
		Knight uther = new HolyKnight("우서");
		Knight genji = new MagicKnight("겐지");
		atomic.slash();
		uther.slash();
		genji.slash();
		Healer healer = (uther instanceof Healer) ?
				(HolyKnight) uther : null;
		healer.heal();
		healer.recovery();
		Magician magician = (genji instanceof Magician) ?
				(MagicKnight) genji : null;
		magician.magicShield();
		magician.teleport();
	}

}
