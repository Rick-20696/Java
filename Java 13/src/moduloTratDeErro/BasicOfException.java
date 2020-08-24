package moduloTratDeErro;

public class BasicOfException {

	public static void main(String[] args) {
		
		/*
		 * Execution Stack is the where stay all methods that are executed!
		 * Through that i can look where happened the exception.
		 * 
		 * Exception is error that can be treated, example: pa
		 * Error is a critic error, example: error of JVM
		 * 
		 * When an error happens the program ends
		 */

		Student s1 = null;
		
		//In "try" i have a code that can throw an exception
		try {
			
			//This is a exception: type of exception is of Class "ArithmeticException", message: /By zero
			System.out.println(7 / 0); 			
		
		} catch (ArithmeticException exception) {
			//In "catch" i will treat this exception
			
			/*
			 * I can treating the error generically: Exception
			 * Or treating the specific error: NameException
			 */
			
			exception.getMessage();
		}
		
		try {
			//This is a exception: NullPointException, message: null
			getNameStudent(s1);
		} catch (Exception e) {
			//Take the exception in stack
			e.printStackTrace();
			
			//I can have a muted catch
		}
		
		System.out.println("End XD");
	}
	
	static void getNameStudent (Student student) {
		System.out.println(student.name);
	}
}
