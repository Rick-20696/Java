package moduloPoo.Encapsulamento.CasaB;

import moduloPoo.Encapsulamento.CasaA.Wife;

public class GirlFriend {
	//girlfriend have a mother in law
	
	Wife monLaw = new Wife();
	
	void view () {
		//only can see the public attribute
		System.out.println(monLaw.attComum);
	}
}
