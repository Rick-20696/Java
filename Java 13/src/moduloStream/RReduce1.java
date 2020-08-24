package moduloStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class RReduce1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> sum = (amount, n) -> n + amount;
		
		/*
		 * Reduce is a method that ends the stream, so i can't put more operators!
		 * Reduce receive two parameters: Amount and the element.
		 * By default, the amount values is 0, but i can change
		 */
		
		//I call the "get" because reduce there is not return
		//I can execute a parallel stream
		System.out.println(numbers.stream().reduce((amount, n) -> amount + n).get());
		System.out.println(numbers.parallelStream().reduce((amount, n) -> amount + n).get());
		
		//If i define a value to the amount and execute a parallel Stream, i will have problems!
		//The value of amount will used all executions
		//Here, i not need of "get" because my function already returns
		System.out.println(numbers.parallelStream().reduce(100, sum));
		
		//I can make a PipeLine
		numbers.stream()
		.filter(n -> n > 5)
		.reduce(sum)
		.ifPresent(System.out::println);
	}
}
