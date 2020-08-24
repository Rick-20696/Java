package moduloStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MMap {

	public static void main(String[] args) {
		
		//MAP - Intermediate Operator Stream
		
		Consumer<Object> print = System.out::print;
		
		//I have a list with some numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(print);
		
		System.out.println();
		
		//I can using the Map to pass a Lambda expression that will change all elements
		//Later i go through all elements
		numbers.stream().map(e -> e + 2).forEach(print);
		
		
		Product p1 = new Product("Notebook", 2408.99, 0.1);
		Product p2 = new Product("Cell", 799.90, 0.13);
		
		List<Product> products = Arrays.asList(p1, p2);
		
		System.out.println();

		//I can pass a Lambda expression and too a Functional Interface that has a Lambda Expression
		//The methods are in a other Class: "Functions"
		//I can composing many functions passing through MAP
		products.stream().map(Functions.realPrice).map(Functions::exclamations).forEach(print);
		
	}
}
