package moduloStream.Desafio;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Functions {

	@SuppressWarnings("static-access")
	public static final Function<Integer, String> toBinary = num -> num.toBinaryString(num);
	
	public static Consumer<Object> print = System.out::println;
	
	public static Function<String, Integer> binaryToInt = string -> Integer.parseInt(string, 2);
	
	public static final Function<String, String> inverterString = string -> {
		return new StringBuffer(string).reverse().toString();	
	};
}
