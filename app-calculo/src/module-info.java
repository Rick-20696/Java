import com.ricardo.app.ICalculadora;
import com.ricardo.app.calculo.Calculadora;

//open module calculo -> significa que as classes estão sujeitas a alterações por java reflection
//Básicamente terás possibilidade de mudar atributos e métodos em runtime. Posso também abrir apenas um package com "opens"
module calculo {
	//Eu preciso explicictar qual package vou exportar. Sub package não são exportados
	exports com.ricardo.app.calculo;
	
	
	//Eu posso também exportar para um módulo em específico.
//	exports com.ricardo.app.calculo 
//	to app.financeiro;
	
	requires api;
	
	//Eu estou disponibilizando um Serviço de implementação, onde Calculadora (deste módulo) implementa
	//ICalculadora (de API)
	provides ICalculadora
		with Calculadora;
}	