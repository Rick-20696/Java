package m3ClassesEMetodos;

public class AtribuicaoVsReferencia {

	public static void main (String [] args) {
		//assignment 
		int a = 2;
		int b = a; //"b" receive the same value
		
		a++; //2+1
		b--; //2-1
		System.out.printf("Value of a: %d, value of b: %d", a, b);
		System.out.println();
		
		//reference 
		Produto p3 = new Produto(); //p3 have the localization of instance
		Produto p4 = p3; //Here, p4 have the same localization,
						 //Any change will be in same instance
		
		p4.nome = "Cabra"; //It feels like i'm changing the name of p4
		System.out.println(p3.nome); //but i'm changing in instance
		
		
	}
}
