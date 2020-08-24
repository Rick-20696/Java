package moduloPoo.Herança.Tests;

import moduloPoo.Herança.Desafio.Car;
import moduloPoo.Herança.Desafio.Ferrari;
import moduloPoo.Herança.Desafio.Gol;

public class Program {

	public static void main(String[] args) {
		Car c1 = new Gol ();
		Car c2 = new Ferrari();
		Ferrari f1 = new Ferrari();
		
		//"Car" doesen't have "onTurbo", only the specific Class 
		f1.onTurbo();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(f1);
		
		//***Speeding***
		c1.speed();
		c1.speed();
		c1.speed();
		c1.speed();
		
		c2.speed();
		c2.speed();
		c2.speed();
		c2.speed();
		c2.speed();
		c2.speed();
		c2.speed();
		
		f1.speed();
		f1.speed();
		f1.speed();
		f1.speed();
		
		System.out.println();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(f1);

		System.out.println();

		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();

		System.out.println(c1);
	}
}
