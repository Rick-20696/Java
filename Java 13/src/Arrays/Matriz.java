package m4Arrays;
import java.util.Scanner;

public class Matriz {
	/*
	 * The matrix concept refers  to the dimensions of array.
	 * Let's create a array within another array 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		//Those variables will save the amount of students and notes
		int qntdStudents;
		int qntdNotes;
		
		System.out.print("How many students are there in the class? ");
		qntdStudents = in.nextInt();
		System.out.print("How many notes for each student? ");
		qntdNotes = in.nextInt();
		
		//Let's create a array of two dimensions (matrix)
		//The dimensions are organized like that: 
		//type [x][y] arrayX = new type [x][y];  
		double [][] notesStudents = new double [qntdStudents][qntdNotes];
		
		//variable for sum
		var total = 0.0;
		//This "for" will pass per "qntdStudnets"
		for (int i = 0; i < notesStudents.length; i++) {
			//This, per "qntdNotes"
			for (int j = 0; j < notesStudents[i].length; j++) {
				System.out.printf("Type it the note %d for student %d: ", j+1, i+1);
				
				notesStudents [i][j] = in.nextDouble();
				total +=notesStudents[i][j];
			}
		}
		
		var average = total / (qntdStudents * qntdNotes);
		System.out.printf("The average of class is %.2f", average);
		
		in.close();
	}
}
