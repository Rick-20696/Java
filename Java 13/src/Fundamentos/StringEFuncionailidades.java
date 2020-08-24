package m1Fundamentos;

import java.util.Scanner;

public class StringEFuncionailidades {

	public static void main(String[] args) {
		/*
		 * The string has diverse functions,
		 * but should see the way we do.
		 * We must remember that String don'ts a type primitive,
		 * but yes a Class
		 */
		
		//after of begin, see a curiosity of class "Scanner"
		
		//The mode of read and write's different
		
		Scanner input = new Scanner (System.in);
		String test = input.next(); //here "test" is read only the text
		System.out.println(test);
		
		Scanner in = new Scanner (System.in);
		String teste = in.nextLine(); //here "teste" is read all text entered 		
		System.out.println(teste);
		
		//This does all difference when compare Strings
		
		System.out.println(test == teste); //This's mode wrong 
		System.out.println(test .equals(teste)); //This's mode correct, result's "false"
		
		String a = "\n\nHello, guys";
		a.concat("!!!"); // here you're contacting with the string 
		System.out.println(a + "\n");
		
		a = a.concat("!!!"); // here "!!!" is contacted with the value of string
		System.out.println(a + "\n");
		
		//see some functions 
		System.out.println(a.startsWith("Hello")); //begin with "parameter"
		System.out.println(a.endsWith("guys")); //end with "parameter"
		System.out.println(a.toLowerCase()); //for box high 
		System.out.println(a.toUpperCase()); //for box low
		System.out.println(a.length()); //length of value 
		System.out.println(a.equals("Olá, garotos")); //equality of values between strings
		
		a.trim(); //limpa espaço
		
		input.close();
		in.close();
		
	}
}
