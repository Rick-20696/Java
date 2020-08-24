package m3ClassesEMetodos;
 
public class ProdutoMain {
	//Should create a class with PSVM for execution
	public static void main(String[] args) {
		//Declare the object (class), start, assign the constructor
		//Now you have a instance (object) and can use
		Produto p1 = new Produto ();
		p1.nome = "PC";
		p1.custo = 1780.00;
		p1.preco = p1.custo + (0.25*p1.custo);
		p1.desconto = 0.25;
		p1.precoFinal = p1.preco - (p1.desconto*p1.preco);
		
		System.out.println(p1.nome);
		System.out.println(p1.custo);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println(p1.precoFinal);
		
		System.out.println("\n");
		
		Produto p2 = new Produto ("Celular");
		p2.custo = 1780.00;
		p2.preco = p2.precoP();
		p2.desconto = 0.25;
		p2.precoF();
		
		System.out.printf("%s \n%.2f \n%.2f \n%.2f \n%.2f", p2.nome, p2.custo, p2.preco, p2.desconto, p2.precoF());
		
		Produto p3 = new Produto ();
		p3.nome = "Notbook";
		p3.preco = 1500.00;
		
	}
}
