package moduloLambdas.InterfacesFuncionais;

import java.util.function.Predicate;

public class Predict2 {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		Predicate<Integer> treDigit = num -> num >= 100 || num <= 999;

		//As "Predicate" return booleans values, i can do composition by operators
		
		//the number is even AND has three digits?
		System.out.println(isEven.and(treDigit).test(130));

		//the number is even OR has three digits?
		System.out.println(isEven.or(treDigit).test(40));
				
		//the number is even and there doesen't three digits?
		System.out.println(isEven.and(treDigit).negate().test(130));
		
	}
}
