
public class Empty implements Cell{
	@Override
	public void cellValue(Player p) {
		System.out.println("Empty Player-" + p.playerID + " Money-"+ p.money + " Position-"+p.position);
	}
}
