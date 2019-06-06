import java.util.ArrayList;
import java.util.List;

public class Player {

	int playerID;
	int money=1000;
	int position=-1;
	
	public int getPlayerID() {
		return playerID;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public Player(int playerId) {
		this.playerID=playerId;
	}
	
	public boolean buyHotel() {
		if(money>200) {
			money-=200;
			return true;
		}
		return false;
	}
	
	public int updatePositon(int roll) {
		if((this.position+ roll) >45){
			System.out.println("Position =" +this.position+ "+" +roll +"-"+44);
			this.position=(this.position+roll) - 44;
		}
		else
		{
			this.position+=roll;
		}
		return this.position;
	}
	
	public void addMoney(int money) {
		this.money+=money;
	
	}
	public void giveFIne(int money) {
		this.money-=money;
		
	}
	
	
	
	
	
	
	
}
