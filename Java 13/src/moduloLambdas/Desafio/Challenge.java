package moduloLambdas.Desafio;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Challenge {

	public static void main(String[] args) {
		
		Product not = new Product("Notebook", 2408.99, 0.10);
		
		BiFunction<Double, Double, Double> p1 = (price, discount) -> price * (1 - discount);		
		Function<Double, Double> p2 = price -> price >= 2500? price * 0.085: price;
		Function<Double, Double> p3 = price -> price >= 3000? price + 100: price + 50;
		Function<Double, String> p5 = price -> String.format("R$ %.2f", price);
		
		System.out.println(p1.andThen(p2).andThen(p3).andThen(p5).
				apply(not.price, not.discount));
		
	}
}
