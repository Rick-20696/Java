	package moduloLambdas.InterfacesFuncionais;

import java.util.function.Predicate;

public class Predict {

	public static void main(String[] args) {
		//Predicate is a Functional Interface of type Product: function with boolean value
		//"isExpensive" receive a parameter "product" 
		//"Product" receive a lambda express 
		Predicate<Product> isExpensive = product -> product.price >= 550;
		
		Product p1 = new Product("notebook", 2408.99, 0.15);
		
		System.out.println("The price of product is expensive? " + isExpensive.test(p1));
		
		isExpensive = product -> (product.price - product.discount * product.price) >= 550;

		System.out.println("\nThe price with discount of product is expensive? " + isExpensive.test(p1));

		isExpensive = product -> product.discount >= 0.25;
		
		System.out.println("\nThe discount of product is good? " + isExpensive.test(p1));
	}
}
