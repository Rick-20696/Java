package moduloStream;

import java.util.Arrays;
import java.util.List;

public class Others {

	public static void main(String[] args) {
		
		Student s1 = new Student("Aline", 9.2);
		Student s2 = new Student("Teixeira", 3.2);
		Student s3 = new Student("Ramos", 6.2);
		Student s4 = new Student("Sousa", 7.5);
		Student s5 = new Student("Barbosa", 8.2);
		Student s6 = new Student("Barbosa", 8.2);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
		
		System.out.println("Distinc \n");
		
		//Give me only distinct students
		students.stream()
		//i need of HashCode
		.distinct().forEach(System.out::println);
				
		System.out.println("\nSkip \n");
		
		//Skip the elements
		students.stream()
		.distinct().skip(2).forEach(System.out::println);

		System.out.println("\nSkip and Limit\n");

		//Skip and Limit: skip elements with a limit of elements
		students.stream()
		.distinct().skip(2).limit(1).forEach(System.out::println);

		//Take the elements while a condition be true
		System.out.println("\nTakeWhile\n");
		students.stream()		
		//If the Predicate returning false, this will pass all elements that returned true to forEach.
		//Here, "Teixeira" not has note >= 7, so this will pass only "Aline"
		.takeWhile(student -> student.note >= 5)
		.forEach(System.out::println);
		
	}
}
