
public class Jail implements Cell{

	@Override
	public void cellValue(Player p) {
		p.giveFIne(150);
		System.out.println("Jail Player-" + p.playerID + " Money-"+ p.money + " Position-"+p.position);

	}

}
