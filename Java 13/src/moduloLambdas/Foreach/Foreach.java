package moduloLambdas.Foreach;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
	
	static void prin(String name) {
		System.out.println("My name is: " + name);
	}
	
	public static void main(String[] args) {
		
		List<String> approved = new ArrayList<>();
		
		approved.add("Aline");
		approved.add("Teixeira");
		approved.add("Ramos");
		
		//traversing the objects of list
		System.out.println("Traditional form: \n");
		
		for (String name: approved) {
			System.out.println(name);
		}

		System.out.println("\nLambda form: \n");
		
		//reading:
		//for each element that "name" will receive, write the "name"
		approved.forEach(name -> {
			System.out.println(name);
		});
		
		//method reference
		//for each element of "approved" call the SOUT
		System.out.println("\nmethod reference: \n");
		approved.forEach(System.out::println);
		
		System.out.println("\nLambda form 2: \n");
		approved.forEach(name -> prin(name));

		System.out.println("\nmethod reference 2: \n");
		approved.forEach(Foreach::prin);
		
	}
}
