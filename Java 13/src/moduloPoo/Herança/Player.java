package moduloPoo.Herança;

public class Player {
	private int x;
	private int y;
	protected int life = 100;
	
	/*
	 * builds with inherit
	 * if i not have a default build, i need defining in "Hero/Monster"
	 */
	protected Player (int x, int y){
		this.x = x;
		this.y = y;
	}
		
	/*
	 * because i not using default values?
	 * when i have a set amount of options
	 * i using the ENUM (Enumeration)
	 */
	public void walk (Direction direction) {
		switch (direction) {
		case norte: 
			y--; 
			break;
		case leste:
			x++;
			break;
		case sul:
			y++;
			break;
		case oeste:
			x--;
			break;
		default:
			break;
		}
	}
	
	//method to attack a opponent
	public boolean attack(Player opponent) {
		//To attack, the position difference between players must be 1 to x (y) and 0 to y (x)
		int diffX = Math.abs(opponent.x - this.x);
		int diffY = Math.abs(opponent.y - this.y);
		
		if (diffX == 1 && diffY ==0) {
			opponent.life -= 10;
			return true;
		}
		else if (diffX == 0 && diffY == 1) {
			opponent.life -= 10;
			return true;
		}
		else
			return false;
		
	}
	
	//a method to know the position of player
	public String toString () {
		return "Your position is " + x + "x and " + y + "y.\nYour life is " + life;
	}
}
