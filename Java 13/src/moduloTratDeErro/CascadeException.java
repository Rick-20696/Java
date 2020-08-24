package moduloTratDeErro;

public class CascadeException {

	public static void main(String[] args) {
		
		/*
		 * I can have a exception caused by other exception!
		 * 
		 * I'm pass "null" to "methodA" that called "methodB"
		 * In "methodB", if the parameter is "null", NullPointer is throw
		 */
		methodA(null);
		//IllegalArgument is caused by NullPointer
	}
	
	static void methodA (Student student) {
		try {
			methodB(student);
		} catch (Exception e) {
			//Inside of a "catch" i can throw i new Exception
			
			//This Exception is caused by "e" of "Exception"
			throw new IllegalArgumentException(e);
		}
	}
	static void methodB(Student student) {
		if (student == null)
			throw new NullPointerException("Student null");
		System.out.println(student.name);
	}
}
