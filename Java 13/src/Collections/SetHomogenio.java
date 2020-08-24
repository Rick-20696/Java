package m4Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogenio {

	/* I defined a type to my collection
	 * in a heterogeneous collection I can add "objects",
	 * in a homogeneous one, only of the defined type
	 */
	/* Set <String> lista = new HashSet<>(); 
	 * HashSet is not ordered, TreeSet is ordered, BUT...
	 * TreeSet is part of SortedSet usually
	 */
	public static void main(String[] args) {
		//"<String>" is generic
		//here is ordered
		Set <String> listTeachers = new HashSet<>();
		listTeachers.add("Chico");
		listTeachers.add("Andreia");
		listTeachers.add("Sérgio");
		
		System.out.println("\n**Teachers**\n");
		
		for(String teacher: listTeachers) {
			System.out.println(teacher);
		}
		
		//Here not ordered
		Set <String> listStudents = new TreeSet<>(); 
		listStudents.add("Aline");
		listStudents.add("Teixeira");
		listStudents.add("Ramos");
		listStudents.add("Sousa");
		
		System.out.println("**Students**\n");
		
		for(String student: listStudents) {
			System.out.println(student);
		}
		
		
		SortedSet <Double> notesStudents = new TreeSet<>();
		notesStudents.add(7.5);
		notesStudents.add(8.1);
		notesStudents.add(8.9);
		notesStudents.add(9.7);
		
		System.out.println("\n**Notes for each student  respective**\n");
		
		for(double notes: notesStudents) {
			System.out.println(notes);
		}
	}
}
