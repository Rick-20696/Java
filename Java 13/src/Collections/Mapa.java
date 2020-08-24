package m4Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> user = new HashMap<>();
		
		//**adding**
		
		//"PUT" add if the element not exist 
		//or replace if "id" be the same because the map not accept duplicates 
		
		user.put(1, "Aline");
		user.put(2, "Ricardo");
		user.put(3, "Teixeira");
		user.put(4, "Ramos");
		user.put(5, "Sousa");
		
		System.out.println(user.size()); //how many elements does it have?
		System.out.println(user.keySet()); //give me all keys
		System.out.println(user.values()); //give me all values
		System.out.println(user.entrySet()); //give me keys and your values
	
		System.out.println("\n" + user.containsKey(20)); //contain that key?
		System.out.println(user.containsValue("Ricardo")); //contain that value?
		
		System.out.println("\n" + user.get(7)); //give the element with key = 7
		
		System.out.println();
		//traversing by key
		for(int key: user.keySet()) {
			System.out.println(key);
		}
		System.out.println();
		//traversing by value
		for(String name: user.values()) {
			System.out.println(name);
		}
		System.out.println();
		//traversing by key and value
		for(Entry<Integer, String> register: user.entrySet()) {
			System.out.println(register.getKey() + " " + register.getValue());
		}
	}
}
