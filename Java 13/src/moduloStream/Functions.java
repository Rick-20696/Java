package moduloStream;

import java.util.function.Function;

public interface Functions {

	//I can define my methods here and using in any place
	
	//Functional Interfaces can be Final
	public static final Function<Product, String> realPrice = product -> {
		double realPrice = product.price * (1 - product.discount);
		return String.format("%s cost %.2f", product.name, realPrice);
	};
	
	//A method can't be final because it has to be override
	public static String exclamations (String s) {
		return s + "!! ";
	}
}
