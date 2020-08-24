package moduloPoo.Herança.Tests;

import moduloPoo.Herança.Direction;
import moduloPoo.Herança.Hero;
import moduloPoo.Herança.Monster;
import moduloPoo.Herança.Player;

public class Game {
	public static void main(String[] args) {
		/*
		 * i can using the methods with a Player, Hero and Monster
		 * Hero and Monster too? Yea, all inherit from Player
		 */
		
		Player p1 = new Hero (10, 10);
		Player p2 = new Monster (10, 10);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// i cannot attack because difference of position, P2 is has same coordinates that P1
		System.out.println("\nWas the attack succesful? " + p1.attack(p2));
		
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		
		//P2 walked
		p2.walk(Direction.norte);
		System.out.println("\nWas the attack succesful? " + p1.attack(p2));	
	
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
	}
}
