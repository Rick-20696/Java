package moduloStream.Desafio;

import java.util.Arrays;
import java.util.List;

import moduloStream.Product;

public class ChallegenFilter2 {

	public static void main(String[] args) {
		
		Product p1 = new Product("J5 Pro", 909.90, 0.2, 0);
		Product p2 = new Product("G2", 1190.50, 0.3, 0);
		Product p3 = new Product("J6", 706.10, 0.1, 9.50);
		Product p4 = new Product("G6 Plus", 1310.50, 0.3, 0);
		Product p5 = new Product("G6", 1250, 0.3, 9.50);
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
		
		products.stream()
		.filter(p -> p.discount >= 0.3)
		.filter(p -> p.frete == 0)
		.map(p -> String.format("%s is with 30 percent of discount and there is not freight!", p.name))
		.forEach(System.out::println);
		
	}
}
