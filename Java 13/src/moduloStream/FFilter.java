package moduloStream;

import java.util.Arrays;
import java.util.List;

public class FFilter {

	public static void main(String[] args) {
		
		Product p1 = new Product ("Notebook", 2408.99, 0.1);
		Product p2 = new Product ("J5", 900.90, 0.13);
		Product p3 = new Product ("PC", 780.99, 0.11);
		Product p4 = new Product ("G2", 699.90, 0);
		Product p5 = new Product ("PS2", 649.80, 0.2);
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
		
		/*
		 * Filter will receive a Predicate to check the conditions and generate a new list/array
		 * I can using this new object in a Map and after show 
		 */
		
		//i want show only the expensive products
		products.stream()
		.filter(p -> p.price >= 650)
		.map(p -> String.format("%s is on the list of the most expensive!", p.name))
		.forEach(System.out::println);
	}
}
