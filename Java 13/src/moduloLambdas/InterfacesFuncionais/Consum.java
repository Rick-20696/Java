package moduloLambdas.InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consum {

	public static void main(String[] args) {
		
		//Consumer is a class that receive one parameter and not there is not return!
		Consumer<Product> con = product -> System.out.println(product.name + "\n");
		
		/*
		 * I can't print in console with the method "accept".
		 * But i can define a lambda function that will print in console!
		 * Because "accept" is a method that receive one parameter and returns nothing	
		 */
		
		System.out.println("Manually printing: calling the 'accept'");
		
		con.accept(new Product("PC", 699.90, 0.16));
	
		// *** automatic printing ***
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Notebook", 2408.99, 0));
		products.add(new Product("Cell", 900.99, 0.11));
		products.add(new Product("Notebook", 2408.99, 0));
		
		System.out.println("Automatic printing: calling the Con in forEach");

		//"forEach" receive a "Consumer", so the "accept" is called
		products.forEach(con);

		System.out.println("Automatic printing: Lambda function in forEach");
		
		products.forEach(prin -> System.out.println(prin.name + "\n"));
		
		System.out.println("Automatic printing: method reference in forEach");

		//Method references will seeking a String, if the type of list there is not nothing
		//i need implements the "toString"
		products.forEach(System.out::println);
	}
}
