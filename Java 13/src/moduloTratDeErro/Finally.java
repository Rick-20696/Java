package moduloTratDeErro;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		try {
			System.out.println(7 / in.nextInt());
			//in.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			in.close();
			System.out.println("I am finally o/");
		}
		
		//"finally" will be executed ever!
		//I can forcing operations with the finally
		System.out.println("End XD");
	}
}
