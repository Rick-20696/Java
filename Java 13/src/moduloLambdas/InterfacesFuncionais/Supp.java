package moduloLambdas.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supp {

	public static void main(String[] args) {
		
		/*
		 * "Supplier" only return! As does not receive parameters i need of parenthesis ()
		 * i can have generic chains
		 */
		
		Supplier<List<String>> list = () -> Arrays.asList("Aline", "Teixeira", "Ramos");

		System.out.println(list.get());
	}
}
