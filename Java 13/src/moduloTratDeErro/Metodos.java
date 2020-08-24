package moduloTratDeErro;

public class Metodos {

	public static void main(String[] args) {
		methodA(2, 3);
		
		System.out.println("retornando" + methodA(2));;
	}
	
	static void methodA (int divisor, int soma) {
		System.out.println((5 / divisor) + soma);
	}
	static double methodA (int divisor) {
		return 5 / divisor;
	}
}
