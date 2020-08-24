package desafiosModulo4;
import java.util.Scanner;

public class D1Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qntdNotes;
		double total = 0;
		
		System.out.print("type it amount of notes student: ");
		qntdNotes = in.nextInt();
		
		double[] notesStudent = new double [qntdNotes];
		
		for (int i = 0; i < qntdNotes; i++) {
			System.out.printf("Type it the value of %d note: ", i+1);
			notesStudent[i] = in.nextDouble();
		}
		
		for (double sum: notesStudent) {
			total += sum;
		}

		System.out.printf("The avarege is: %.2f", total/qntdNotes);
		
		in.close();
	}
}
