module app.financeiro {
	//Para pegar o package de outro projeto, preciso requerer por nome do mpodulo.
	//Assim tenho tudo que é exportado.
//	requires calculo;
	
	//Onde eu uso o Serviço, preciso explicitar o Serviço, então eu posso cancelar a importação da
	//Classe implementadora e depender apenas da Interface
	
	requires api;
	uses com.ricardo.app.ICalculadora;
}