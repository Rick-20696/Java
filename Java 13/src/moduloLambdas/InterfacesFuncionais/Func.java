package moduloLambdas.InterfacesFuncionais;

import java.util.function.Function;

public class Func {
	
	public static void main(String[] args) {
	
		/*
		 * The Function Interface "Function" has one type "X" of return and a type "Y" of input!
		 * I can define different types or the same
		 */
		Function<Integer, String> check = namber -> namber % 2 == 0? "Even": "Odd";
		
		//I need call the "apply" because "Function" is not return void
		System.out.println(check.apply(21));
		
		/*
		 * But... It's very abstract, let's chain lambdas functions
		 * This is function composition.
		 * The parameter type of 2º Function must be equals to return type of 1º Function
		 * all functional interface has own functions composition
		 */
		
		//see that "string" is after of text because "string" is the return of "check"
		Function<String, String> complete = string -> "The namber is: " + string;
		
		//now, "string" is before the text because "string" is the return of "complete"
		Function<String, String> exclamation = string -> string + "!!!";
		
		//"andThen" first complete the function, after applies the function called 
		//do "check", and then, call "complete", and then, call "exclamation"
		String result = check.andThen(complete).andThen(exclamation).apply(20);
		System.out.println(result);
	}
}
