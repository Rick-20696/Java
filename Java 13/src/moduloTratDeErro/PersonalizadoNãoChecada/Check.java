package moduloTratDeErro.PersonalizadoNãoChecada;

import moduloTratDeErro.Student;

public class Check {

	private Check() {}
	
	public static void checkStudent(Student student) {
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
