package m3ClassesEMetodos;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Ricardo";
		u1.cpf = "410";
		
		Usuario u2 = new Usuario();
		u2.nome = "Ricardo";
		u2.cpf = "410";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		System.out.println(u1.equals(new Produto()));
	}
}
