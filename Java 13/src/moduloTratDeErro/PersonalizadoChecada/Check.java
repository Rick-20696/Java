package moduloTratDeErro.PersonalizadoChecada;

import moduloTratDeErro.Student;

public class Check {

	private Check() {}
	
	//When i have exceptions not checked, i need put "throws" in method that is calling
	public static void checkStudent(Student student) throws EmptyString, NegativeNumberException{
		//I have two personalized exceptions and one exceptions of Java
		
		//This conditionals are tests, if true i throw a exception
		if (student == null) {
			throw new IllegalArgumentException("This student is null");
		}
		
		if (student.name == null || student.name.trim().isEmpty()) {
			throw new EmptyString("name");
		}
		
		if (student.note < 0 || student.note > 10) {
			throw new NegativeNumberException("note");
		}
	}
}
