package m4Collections;

import java.util.ArrayList;

public class ListHeterogenea {

	public static void main(String[] args) {
		//i too can create like this: List<generic> name = new ArrayList();
		//need organized the imports
		ArrayList<Usuario> list = new ArrayList<>();
		
		//creating instance
		Usuario u1 = new Usuario("Aline");
		//**adding to collection**
		list.add(u1);
		//i too can add like this
		list.add(new Usuario("Teixeira"));
		list.add(new Usuario("Ramos"));
		list.add(new Usuario("Sousa"));
		
		/*
		 * With method "toString", now have a information 
		 *  implemented the method,
		 *  i can access by index or by class created.
		 */
		System.out.println(list.get(0)); //accessing by index
		System.out.println();
		System.out.println(list.get(1).nome); //accessing by class
		
		for(Usuario u: list) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		//**removing of collection**
		
		//remove by index return THE ELEMENT REMOVED
		System.out.println("Element removed: " + list.remove(3) + "\n");
		/*remove by object return VALUE BOOLEAN 
		 *will be used the HashCode 
		 *to check the existence of object in "list".
		 *
		 *without HashCode/Equals, the return will be "false"
		 *the localization is different
		 */
		System.out.println("The element was removed? " + list.remove(new Usuario("Ramos")));
		
		System.out.println();
		//check the existence of elements
		System.out.println("The element is valid? " + list.contains(new Usuario("Aline")));
		
	}
}
