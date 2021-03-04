import com.ricardo.app.ICalculadora;
import com.ricardo.app.calculo.Calculadora;

//open module calculo -> significa que as classes est�o sujeitas a altera��es por java reflection
//B�sicamente ter�s possibilidade de mudar atributos e m�todos em runtime. Posso tamb�m abrir apenas um package com "opens"
module calculo {
	//Eu preciso explicictar qual package vou exportar. Sub package n�o s�o exportados
	exports com.ricardo.app.calculo;
	
	
	//Eu posso tamb�m exportar para um m�dulo em espec�fico.
//	exports com.ricardo.app.calculo 
//	to app.financeiro;
	
	requires api;
	
	//Eu estou disponibilizando um Servi�o de implementa��o, onde Calculadora (deste m�dulo) implementa
	//ICalculadora (de API)
	provides ICalculadora
		with Calculadora;
}	