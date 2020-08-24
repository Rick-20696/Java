package moduloLambdas;

public class Calculator {
	
	public static void main(String[] args) {
		//in each class, will have the same method, but with different behavior.
		Calc calc =  new Sum ();
		System.out.println(calc.execute(15, 15));
		
		calc = new Multiply();
		
		System.out.println(calc.execute(5, 6));
	}

}
