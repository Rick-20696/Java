/*
 * Object: Representation of anything of world 
 * Class: Definition detailed of object 
 * Constructor: who builds, from a class, the object 
 */
package m3ClassesEMetodos;

//"Produto" is my object, it must be defined by class
//The class that define the object not need "PSVM"
public class Produto {
	//Those are the attributes
	String nome;
	double custo;
	double preco;
	double desconto;
	double precoFinal;
	
	//Any class have a constructor
	//This is standard constructor 
	Produto (){		
	}
	//This is personalized constructor 
	Produto (String nomeProduto){
		nome = nomeProduto; //The attribute "nome" be receiving a parameter 
							//This parameter will defined in PSVM when called 
	}
	
	//A class can have methods
	
	//all method have: type of return and signature
	//signature is name and parameters
	double precoF () { 
		return (preco - (desconto*preco));
	}
	double precoP () {
		return (custo + (0.25*custo));
	}
}
