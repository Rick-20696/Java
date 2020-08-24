package moduloPoo.Encapsulamento.CasaB;

import moduloPoo.Encapsulamento.CasaA.Wife;

public class Son extends Wife{
	//if I instantiate a wife here I can only see the public attributes
	Wife mon = new Wife();
	
	void viewInstance () {
		System.out.println(mon.attComum);
	}
	
	//But, Son inherit of Wife, so i have access
	
	void viewInherit () {
		System.out.println(attComum);
		System.out.println(attProtected);
		
		//i not have access to default attribute because not i'm in same packages
	}
}
