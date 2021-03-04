package com.ricardo.app.calculo;

import com.ricardo.app.calculo.interno.Operacoes;

public class Calculadora {
	Operacoes op = new Operacoes();
	
	public double soma(double... nums) {
		return op.soma(nums);
	}
	
	
}
