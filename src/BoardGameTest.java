
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BoardGameTest {

	BusinessBoardGame business = new BusinessBoardGame();

	@Test
	public void testRollFinal() {
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		business.getPlayer().add(p1);
		business.getPlayer().add(p2);
		business.getPlayer().add(p3);
		List<Integer> diceRollList = Arrays.asList(4, 4, 4, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12, 2,
				3, 5, 6, 7, 8, 5, 11, 10, 12);
		
		System.out.println(diceRollList.size());
		int i;
			for(int j=0;j<30;j+=3) {
				System.out.println("----------------- Round :"+ j/3);
				
				i=0;;
				for(Player p:business.getPlayer()) { 
					business.diceRoll(p, diceRollList.get(j+i));
					i++;
				}
			}
		assertEquals(business.resultList(), Arrays.asList(1200, 1200, 1050));
	}
	
	@Test
	public void testRollOneRound() {
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		business.getPlayer().add(p1);
		business.getPlayer().add(p2);
		business.getPlayer().add(p3);
		List<Integer> diceRollList = Arrays.asList(4, 4, 4);
		
		System.out.println(diceRollList.size());
		int i;
			for(int j=0;j<3;j+=3) {
				i=0;;
				for(Player p:business.getPlayer()) { 
					business.diceRoll(p, diceRollList.get(j+i));
					i++;
				}
			}
		assertEquals(Arrays.asList(950, 950, 900),business.resultList());
	}
	
	@Test
	public void testRollTwoRound() {
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Player p3 = new Player(3);
		business.getPlayer().add(p1);
		business.getPlayer().add(p2);
		business.getPlayer().add(p3);
		List<Integer> diceRollList = Arrays.asList(4, 4, 4, 6, 7, 8, 5, 11, 10);
		
		System.out.println(diceRollList.size());
		int i;
			for(int j=0;j<9;j+=3) {
				System.out.println("--------------------Round ="+(j/3+1));
				i=0;;
				for(Player p:business.getPlayer()) { 
					business.diceRoll(p, diceRollList.get(j+i));
					i++;
				}
			}
		assertEquals(Arrays.asList(950, 950, 900),business.resultList());
	}

}
