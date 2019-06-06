
public class Treasure implements Cell{

	@Override
	public void cellValue(Player p) {
		p.addMoney(200);
		System.out.println("Treasure Player-" + p.playerID + " Money-"+ p.money + " Position-"+p.position);

	}

	

}
