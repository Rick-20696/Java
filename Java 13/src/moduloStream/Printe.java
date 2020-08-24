package moduloStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Printe {

	public static void main(String[] args) {
		
		//Print in console
		List<String> approveds = new ArrayList<>();
		
		approveds.add("Aline");
		approveds.add("Teixera");
		approveds.add("Ramos");
		
		//I control all
		System.out.println("Traditional for");
		for (int i = 0; i < approveds.size(); i++) {
			System.out.println(approveds);
		}
				
		//i control only the print
		System.out.println("foreach");
		for (String name: approveds) {
			System.out.println(name);
		}
		
		//i control the print using while, the "Iterator" has a method that will checking 
		//if have or not elements
		//"iterator();" is a method that implement the Functional Interface
		System.out.println("\nUsing iterator");
		Iterator<String> iterator = approveds.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		//With Stream, the iteration is already implemented
		//So, i pass only a method reference
		//"stream();" too implement the Interface
		System.out.println("\nUsing Stream");
		Stream<String> stream = approveds.stream();
		stream.forEach(System.out::println);
	}
}
