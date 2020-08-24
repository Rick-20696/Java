package moduloStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Matchh {

	public static void main(String[] args) {

		Student s1 = new Student("Aline", 9.2);
		Student s2 = new Student("Teixeira", 3.2);
		Student s3 = new Student("Ramos", 6.2);
		Student s4 = new Student("Sousa", 7.5);
		Student s5 = new Student("Barbosa", 8.2);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
				
		Predicate<Student> approved = student -> student.note > 7;

		//Match return true if there was corresponded
		//Match too is a Terminating Function
		System.out.println(students.stream().allMatch(approved));
		System.out.println(students.stream().anyMatch(approved));
		System.out.println(students.stream().noneMatch(approved));

	}
}
