package moduloLambdas.InterfacesFuncionais;

import java.util.function.BinaryOperator;

public class Calculator3 {
	
	public static void main(String[] args) {
		
		 /* 
		  * "BinaryOperator" is a Functional Interface of Java.Util.Function!
		  * There are many functional interface that can be used
		  * 
		  * Binary is a functional interface similar to that one made in Calculator2
		  */
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		
		System.out.println(calc.apply(2.0, 3.0));
	}

}
