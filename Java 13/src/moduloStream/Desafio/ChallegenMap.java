package moduloStream.Desafio;

import java.util.Arrays;
import java.util.List;

public class ChallegenMap {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.forEach(System.out::print);
		System.out.println("\n\n");
		numbers.stream().map(Functions.toBinary).forEach(Functions.print);

		System.out.println("\n\n");
		numbers.stream().map(Functions.toBinary).map(Functions.inverterString).forEach(Functions.print);

		System.out.println("\n\n");
		numbers.stream().
		map(Functions.toBinary).
		map(Functions.inverterString).
		map(Functions.binaryToInt).
		forEach(Functions.print);
	}
}
