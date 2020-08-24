package m4Arrays;
//This is a class from arrays
import java.util.Arrays;


public class Arrayss {
	/*
	 * Arrays:one-dimensional vector, feature of a array:
	 * Is OBJECT static: fixed size
	 * Homogeneous: accept only a type 
	 */	

	public static void main (String []args) {
		//Declare the type, later "[]", name. Now build 
		//To access the fields it's through the index "[x]" 
		//The index count is from 0 to "n", so, is "n" - 1
		
		int[] a = new int[4];
		a[0] = 1; //you can understand "a[0]" how a variable 
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		System.out.println(Arrays.toString(a));
		
		//example of using a array
		double[] notesStudent = new double [4];
		notesStudent[0] = 7.4;
		notesStudent[1] = 3.2;
		notesStudent[2] = 2.2;
		notesStudent[3] = 5;
		
		var sumNotes = notesStudent[0] + notesStudent[1] + notesStudent[2] + notesStudent [3];
		var average = sumNotes / notesStudent.length;
		System.out.printf("The avarage of notes i: %.2f",average);
		
		var check = average > 5.0? true:false;
		
		if (check == true)
			System.out.println("\nCongratulations!!!");
		else
			System.out.println("\nSorry, try again...");
	}
}
