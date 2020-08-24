package m1Fundamentos;

public class ObjetoVsPrimitivoEWapper {

	public static void main(String[] args) {
		/*
		 * Exist a difference between type primitive and object.
		 * Wrappers's the version object of types primitives
		 */
		
		//Type primitive			//Wrappers (objects)
		//They haven't functions    //They have functions  
		byte a = 1;					Byte ba = 10;
		short ab = 2;				Short bb = 20;
		int ac = 3;					Integer bc = 30;
		long ad = 4;				Long bd = 40L; //"long" need "L" in final of value
		
		System.out.printf ("The values of types primitives are: %d, %d, %d, %d", a, ab, ac, ad);
		System.out.printf("\nThe values of Weappers are: %d, %d, %d, %d,", ba, bb, bc, bd);
	}
}
