package m4Collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		//Creating a set for test the HashCode
		HashSet<Usuario> a = new HashSet<Usuario>();
		//Instancing
		a.add(new Usuario("Ricardo"));
		a.add(new Usuario("Barbosa"));
		a.add(new Usuario("Susto"));
		//result will true
		boolean result = a.contains(new Usuario("João"));
		System.out.println(result);
		
	}
}
