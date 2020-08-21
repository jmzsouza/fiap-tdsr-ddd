package OperadoresAritmeticos;

public class Calculadora {

	public double adicao(double a, double b) {
		return a + b;
	}

	public double subtracao(double a, double b) {
		return a - b;
	}

	public double multiplicacao(double a, double b) {
		return a * b;
	}

	public double divisao(double a, double b) {
		if (b > 0) {
			return a / b;
		}
		return -9999;
	}

}
