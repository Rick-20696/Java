package moduloStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class RReduce3 {

	public static void main(String[] args) {
		
		//I can chain because "add" return the Class Average
		Average average1 = new Average().add(8.9).add(3.5);
		Average average2 = new Average().add(3.5).add(9.9);
		
		System.out.println(average1.getTotal());
		System.out.println(average2.getTotal());
		
		System.out.println(Average.comnineAverage(average1, average2).getTotal());
		
		Student s1 = new Student("Aline", 9.2);
		Student s2 = new Student("Teixeira", 3.2);
		Student s3 = new Student("Ramos", 6.2);
		Student s4 = new Student("Sousa", 7.5);
		Student s5 = new Student("Barbosa", 8.2);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		
		//Let's do with Functions
		
		Predicate<Student> approved = student -> student.note > 7;
		Function<Student, Double> onlyNote = student -> student.note;
		BiFunction<Average, Double, Average> average = (ave, note) -> ave.add(note);
		BinaryOperator<Average> combineAverage = (Average1, Average2) -> Average.comnineAverage(Average1, Average2);
		
		Average av = students.parallelStream()
				.filter(approved)
				.map(onlyNote)
				.reduce(new Average(), average, combineAverage);
		
		System.out.println(av.getTotal());
	}
}
