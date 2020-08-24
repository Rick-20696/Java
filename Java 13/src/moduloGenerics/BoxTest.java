package moduloGenerics;

public class BoxTest {

	public static void main(String[] args) {
		Box1 box1 = new Box1();
		
		//Here is happening a AutoBox. Is a conversion of a literal value to Wrapper Class
		box1.setObject(3.2);

		/*
		 * I can not create a generic Class to use.
		 * If i try this will need casting.
		 * Casting of a type to another give exception.
		 * 
		 * It works if i know that it's inside the box
		 */
		
		//If i do a casting, will give error
		//Integer i = (Integer) box1.getObject();
		Double d = (Double) box1.getObject();
		
		System.out.println(d);
		
		//Now, let's use a Generic Class, i can define a generic type or not
		//If i not define a type will be like if i'm using Box1
		Box2<String> box2 =  new Box2<>();
		box2.setObject("Meaw");
		
		//Now i need not of casting
		String s = box2.getObject();
		System.out.println(s);
	}
}
