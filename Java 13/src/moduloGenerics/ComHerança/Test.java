package moduloGenerics.ComHerança;

public class Test {

	public static void main(String[] args) {
		BoxInt i = new BoxInt();
		i.setObject(32);
		System.out.println(i.getObject());

		BoxDouble<Double> d = new BoxDouble<>();
		d.setObject(3.2);
		System.out.println(d.getObject());
		
		//The Compiler does not the type String or Character  
	}
}
