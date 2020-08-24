package moduloStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		

		Student s1 = new Student("Aline", 9.2);
		Student s2 = new Student("Teixeira", 3.2);
		Student s3 = new Student("Ramos", 6.2);
		Student s4 = new Student("Sousa", 7.5);
		Student s5 = new Student("Barbosa", 8.2);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		
		//To using Max and Min i need of a comparator
		Comparator<Student> compareNote = (st1, st2) -> {
			if(st1.note > st2.note) return 1;
			if(st1.note < st2.note) return -1;
			return 0;
		};
		
		System.out.println(students.stream().max(compareNote));
		System.out.println(students.stream().min(compareNote));
	}
}
