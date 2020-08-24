package moduloGenerics;

import java.util.List;

public class MethodWithGenerics {

	//This method return a Object and wait receive a List of a undefined type
	public static Object getLastElement (List <?> list) {
		return list.get(list.size() - 1);
	}

	//This method has a generic type that it's associated with the generic of List.
	//Like this method has a generic it can return a generic type
	public static <T> T getLastElement1 (List <T> list) {
		return list.get(list.size() - 1);
	}
}
