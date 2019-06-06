
public class Hotel implements Cell{

	@Override
	public void cellValue(Player p) {
		if(BusinessBoardGame.hotelMap.containsKey(p.getPosition())) {
			BusinessBoardGame.hotelMap.get(p.getPosition()).addMoney(50);
			p.giveFIne(50);
		}else {
			if(p.buyHotel()) {
				BusinessBoardGame.hotelMap.put(p.getPosition(), p);
			}
		}
		System.out.println("Hotel Player-" + p.playerID + " Money-"+ p.money + " Position-"+p.position);
	}
}
