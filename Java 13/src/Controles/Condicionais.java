package m2Controles;

public class Condicionais {

	public static void main(String[] args) {
		/*
		 * conditional
		 */
		
		var a = 2;
		var b = 3;
		var c = 5;
		
		//Simple conditional 
		if (a > 0)
			System.out.printf("\n'%d' is bigger than '0' \n", a);
		
		//Composed conditional 
		if (b < 0)
			System.out.println("Loser");
		else 
			System.out.println("Winner");
		
		//Chained conditional
		if (c < 0)
			System.out.println("You're medium");
		else if (c == 3)
			System.out.println("You're small");
		else
			System.out.println("you're tall");
	}
}
