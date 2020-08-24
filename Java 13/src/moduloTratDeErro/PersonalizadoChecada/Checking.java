package moduloTratDeErro.PersonalizadoChecada;

import moduloTratDeErro.Student;

public class Checking {

	public static void main(String[] args) {
		
		Student s1 = new Student ("Aline", 7.9);
	
		//I need treated the Exceptions 
		try {
			Check.checkStudent(s1);			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (EmptyString | NegativeNumberException e) {
			System.out.println(e.getMessage());
		} 
		
		//I'll only get here if all exceptions are handled
		System.out.println("End XD");
	}
}
