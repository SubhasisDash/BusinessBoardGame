import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BusinessBoardGame {

	List<Player> players = new ArrayList<>();
	
	public static Map<Integer,Player> hotelMap=new HashMap<>();

	public static final List<String> CELLPOSITONS = Arrays.asList("E", "E", "J", "H", "E", "T", "J", "T", "E", "E", "H",
			"J", "T", "H", "E", "E", "J", "H", "E", "T", "J", "T", "E", "E", "H", "J", "T", "H", "J", "E", "E", "J",
			"H", "E", "T", "J", "T", "E", "E", "H", "J", "T", "E", "H", "E");

	public void playGame() {
		for (int i = 0; i < 10; i++) {
			for (Player p : players) {
				int roll = (int) Math.random() * 12 - 2;
				diceRoll(p,roll);
			}
		}
	}
	
	public void printGameResults() {
		players.stream().sorted(Comparator.comparing(Player::getMoney)).forEach(p->{
			System.out.println("Player-" + p.getPlayerID() +" has total worth"+ p.getMoney());
		});
	}

	public List<Integer> resultList() {
		return players.stream().sorted(Comparator.comparing(Player::getMoney)).map(Player::getMoney).collect(Collectors.toList());
	}
	
	public void diceRoll(Player player, int roll) {
	
		int playerPos = player.updatePositon(roll);
		
		System.out.println("Player:"+player.getPlayerID() +" Roll:" + roll + " Position:" +playerPos +" CellType:"+CELLPOSITONS.get(playerPos));
		Cell cell=getCelltype(CELLPOSITONS.get(playerPos));
		cell.cellValue(player);
	}

	public Cell getCelltype(String str) {
		if (str.equals("E")) {
			return new Empty();
		} else if (str.equals("J")) {
			return new Jail();
		} else if (str.equals("T")) {
			return new Treasure();
		} else if (str.equals("H")) {
			return new Hotel();
		}
		return null;
	}

	public List<Player> getPlayer() {
		return this.players;
	}
	
	
}
