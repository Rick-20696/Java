package moduloGenerics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pairs<K extends Number, V> {
	//I'm pass the responsibility of defining the generic types to user
	private final Set<Pair<K, V>> items = new HashSet<>();
	
	public void addItem (K key, V value) {
		Pair<K, V> p = new Pair<>(key, value);
		
		if (key.equals(null)) {
			//"Return" in the "void" method? It's as a "break" get out of method
			return;
		} else if (items.contains(p)) {
			//"Contains" it's using Equals and HashCode to check
			items.remove(p);
			items.add(new Pair<K, V>(key, value));
		} else {
			items.add(new Pair<K, V>(key, value));
		}
	}
	
	public V getValue(K key) {
		if (key.equals(null)) return null;
		
		//"findFirst" return a Optional, so i will to create a variable
		Optional<Pair<K, V>> pairOp = items.stream().filter(p -> key.equals(p.getKey())).findFirst();
		
	//I need get the value in "pairOp" to after get value
		return pairOp.isPresent()? pairOp.get().getValue() : null;
	}
}
