package m3ClassesEMetodos;

public class Data {

	//REMEMBER: those are attributes of instance
	//"this" make reference for instance related  members, no for class
	int dia;
	int mes;
	int ano;
	
	Data() {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970); //I'm calling a constructor inside of other constructor
	}
	
	Data(int dia, int mes, int ano){
		/*dia = dia; 
		 * Here, "dia" is a parameter 
		 * and is receiving the value do own parameter
		 * */
		this.dia = dia; //notice the color difference
		this.mes = mes;
		this.ano = ano;
		
		//You can use equals names
	}
	
	String DataFormatada () {
		String format = String.format("%d/%d/%d", this.dia, mes, ano);
		return format;
	}
}
