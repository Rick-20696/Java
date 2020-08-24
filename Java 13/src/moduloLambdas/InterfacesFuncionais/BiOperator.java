package moduloLambdas.InterfacesFuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BiOperator {

	public static void main(String[] args) {
		
		//This interface receive two parameters, the parameter type is equals to return type
		
		//I have only the return, not a message. But i can reusing
		BinaryOperator<Double> avarageBi = (n1, n2) -> {
		double calc = (n1 + n2) / 2;
		return calc;
		};
		
		Function<Double, String> message = avarage -> avarage > 7? "Approved": "Disaproved";
		
		//This Interface is more restrictive
		BiFunction<Double, Double, String> avarage = (n1, n2) -> (n1 + n2) / 2 > 7?
				"Approved": "Disaproved";
	
		System.out.println(avarage.apply(7.3, 6.3));
		System.out.println(avarageBi.andThen(message).apply(7.3, 6.9));
	}
}
