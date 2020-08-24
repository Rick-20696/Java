package moduloPoo.Encapsulamento.CasaA;

@SuppressWarnings("unused")
public class Wife {
	//here let's creating attributes to test the encapsulation
	
	//visible to all
	public String attComum = "...";
	
	//visible to package and class that inherit this
	protected String attProtected = "...";
	
	//visible to package
	String attDefault = "...";
	
	//visible only this class
	private String attPrivate = "...";
}
