module app.financeiro {
	//Para pegar o package de outro projeto, preciso requerer por nome do mpodulo.
	//Assim tenho tudo que � exportado.
//	requires calculo;
	
	//Onde eu uso o Servi�o, preciso explicitar o Servi�o, ent�o eu posso cancelar a importa��o da
	//Classe implementadora e depender apenas da Interface
	
	requires api;
	uses com.ricardo.app.ICalculadora;
}