package m3ClassesEMetodos;

//for use a class of other package you must import
//"import" package.className;

public class This {
	// Standard values 
	//attributes of a class or instance are started by standard value  
	
	//those are attributes of instance
	int i; 
	boolean b;
	String s;
	//those are attributes of class
	static int iI;
	static boolean bB;
	static String sS;
	
	public static void main(String[] args) {
		/*
		 * This X This();
		 * "This" serves to indicate a variable specific
		 * "This();" serves to call a constructor inside of other constructor 
		 */
		
		//Standard builder 
		Data a = new Data();
		System.out.printf("%d/%d/%d", a.dia, a.mes, a.ano);
		System.out.println();
		System.out.println(a.DataFormatada());
		
		Data b = new Data(01, 12, 2019);
		System.out.printf("%d/%d/%d", b.dia, b.mes, b.ano);
		System.out.println();
		System.out.println(b.DataFormatada());
		
		//************************************************************************
		//STANDARDS VALUES
		
		//attributes of class
		System.out.println(iI); //types related numbers to numbers: value 0 or 0.0 
		System.out.println(bB); //type boolean: false
		System.out.println(sS); //All objects: null
		
		//attributes of instance
		This t = new This();
		System.out.printf("%d \n%b \n%s", t.i, t.b, t.s);
	}
}
