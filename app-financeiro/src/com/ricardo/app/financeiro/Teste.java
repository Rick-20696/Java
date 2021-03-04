package com.ricardo.app.financeiro;

import java.util.ServiceLoader;

import com.ricardo.app.ICalculadora;

//import com.ricardo.app.calculo.Calculadora;
public class Teste {
	public static void main(String[] args) {
		//A minha instância também fica diferente, porque como estou dependendo apenas da Interface
		//Só peço para o Java procurar o implementador
		ICalculadora calc = ServiceLoader.load(ICalculadora.class).findFirst().get();
				
		//new Calculadora();
		
		System.out.println(calc.soma(1, 2, 4, 5, 6));
	}
}
