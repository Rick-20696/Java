package m4Arrays;

public class ForEach {
	/*
	 * Here, let's to use the "foreach".
	 * This is a loop specific for arrays.
	 */
	
	public static void main(String[] args) {
		//The arrays too accept direct insertion, see below
		double[] notesStudent = {7.4, 3.2, 2.2, 8.1};

		//we have the normal for 
		for (int i = 0; i < notesStudent.length; i++) {
			System.out.println(notesStudent[i]);
		}
		System.out.println();
		
		//Too we have the for each
		//For each index of array, the variable will have a new value
		for(double note: notesStudent) {
			System.out.println(note);
		}
	}
}
