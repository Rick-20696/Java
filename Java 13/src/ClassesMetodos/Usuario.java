package m3ClassesEMetodos;

public class Usuario {
	//Define attributes of class
	String nome;
	String cpf;
	
	//define criteria for equals
	public boolean equals(Object objeto) {
		//Ensuring than i'll receive a instance of "usuário"
		if (objeto instanceof Usuario) {
		//the instance receive a casting for "objeto"
		Usuario outro = (Usuario) objeto;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean cpfIgual = outro.cpf.equals(this.cpf);
		return nomeIgual && cpfIgual; //only if two vars are true
		}
		else
			return false;
	}
}
