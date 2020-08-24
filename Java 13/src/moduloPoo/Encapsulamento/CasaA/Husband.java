package moduloPoo.Encapsulamento.CasaA;

public class Husband {
	//Husband has a wife
	Wife anne = new Wife();
	
	//method to view 
	void view () {
		//i can view those attributes
		System.out.println(anne.attComum);
		System.out.println(anne.attDefault);
		System.out.println(anne.attProtected);
		
		//but i cannot view the attribute private
	}

}
