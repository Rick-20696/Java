package moduloLambdas.InterfacesFuncionais;

public class Calculator2 {
	
	public static void main(String[] args) {
		
		/*
		 * With a lambda function i can do all this with less code!
		 * I define a anonymous function and step the behavior.
		 * "calc" it's of type "Calc", this has only one method, 
		 * so my lambda expression(Function) match with method in Interface "Calc"
		 */
		
		//The variable receive a lambda function
		Calc2 calc = (x, y) -> {
			return x + y;
		};
		
		//now i can call the function as i called a method of a class
		System.out.println(calc.execute(5, 7));
		
		//i can assign another lambda function
		calc = (x, y) -> x * y;
		System.out.println(calc.execute(5, 7));
	}

}
