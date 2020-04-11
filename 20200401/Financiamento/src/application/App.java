package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Financiamento;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de financiamento: ");
		double valor = sc.nextDouble();
		System.out.print("Digite o percentual de juros: ");
		double juros = sc.nextDouble();
		System.out.print("Digite a quantidade de meses para pagar: ");
		int tempo = sc.nextInt();
		Financiamento financ = new Financiamento(valor, juros, tempo);

		System.out.printf("Valor total a pagar: %.2f%n", financ.calcularValorTotalAPagar());

		sc.close();

	}

}
