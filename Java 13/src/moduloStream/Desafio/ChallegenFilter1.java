package moduloStream.Desafio;

import java.util.Arrays;
import java.util.List;

public class ChallegenFilter1 {

	public static void main(String[] args) {
		Candidate c1 = new Candidate("Aline", 31.7, 92.5);
		Candidate c2 = new Candidate("Teixeira", 76.2, 75.5);
		Candidate c3 = new Candidate("Ramos", 41.7, 31.9);
		Candidate c4 = new Candidate("Ricardo", 21.7, 11.7);
		Candidate c5 = new Candidate("Sousa", 11.7, 17.8);
		
		List<Candidate> approveds = Arrays.asList(c1, c2, c3, c4, c5);
		
		approveds.stream()
		.filter(c -> c.notePhase1 >= 21.0)
		.filter(c -> c.notePhase2 >= 50)
		.map(c -> String.format("Congratulations %s, you went approved!", c.name))
		.forEach(System.out::println);
	}
}
