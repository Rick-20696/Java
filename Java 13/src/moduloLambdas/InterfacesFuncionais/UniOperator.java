package moduloLambdas.InterfacesFuncionais;

import java.util.function.UnaryOperator;

public class UniOperator {
	
	public static void main(String[] args) {
		
		//The input parameter is the same of output
		UnaryOperator<Integer> sum = num -> num + 2;
		UnaryOperator<Integer> multiply = num -> num * 2;
		UnaryOperator<Integer> square = num -> num * num;
		
		int result1 = sum.andThen(multiply).andThen(square).apply(2);
		
		System.out.println(result1);

		//Compose execute the function before of executing the main function 
		int result2 = sum.compose(multiply).andThen(square).apply(2);
		
		System.out.println(result2);
	}

}
