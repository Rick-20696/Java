package moduloStream;

import java.util.Arrays;
import java.util.List;

public class RReduce2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Aline", 9.2);
		Student s2 = new Student("Teixeira", 3.2);
		Student s3 = new Student("Ramos", 6.2);
		Student s4 = new Student("Sousa", 7.5);
		Student s5 = new Student("Barbosa", 8.2);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		
		//making a sum of note
		//pipeLine
		
		//I can't pass a Map to a Filter
		students.stream()
		//approved?
		.filter(student -> student.note > 7)
		//give me only the note of student 
		.map(student -> student.note)
		//do the sum
		.reduce((n, b) -> n + b )
		//print in console
		.ifPresent(System.out::println);;
	}
}
