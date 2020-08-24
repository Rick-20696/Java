package m2Controles;

public class Repetições {

	public static void main(String[] args) {
		/*
		 *repetitions 
		 */
		var a = 0;
		var b = 0;
		
		//while:check the condition before of execute 
		while (a < 10) {
			a ++;
			System.out.printf("\nThe value of a: %d", a);
		}
		
		System.out.println();
		System.out.println();
		//do while: execute before of check the condition
		do {
			b += 2;
			System.out.printf("\nThe value of b: %d", b);
		} while (b < 10);
		
		System.out.println();
		System.out.println();
		//for: is a structure of control complete, has three parts
		for (int i = 1; i < 10; i +=3) {
			System.out.printf("\nThe value of i: %d", i);
		}
		
		System.out.println();
		System.out.println();
		//composed for: the for internal will executed before of for external 
		for (int j = 0; j < 2; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.printf("\nThe value of k: %d", k);
			}
			System.out.printf("\nThe value of j: %d", j);
		};
		/*
		 * "j" repeated 2x;
		 * "k" repeated 6x;
		 */
	}
}
