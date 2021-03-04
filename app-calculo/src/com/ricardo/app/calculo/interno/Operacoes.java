package com.ricardo.app.calculo.interno;

import java.util.Arrays;

public class Operacoes {
	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0, (atual, prox) -> atual + prox);
	}

}
