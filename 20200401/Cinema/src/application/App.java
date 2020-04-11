package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cinema;
import entities.Sala;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos lugares tem dispon�vel na sala do cinema? ");
		Sala sala = new Sala((int) sc.nextDouble());
		System.out.print("Qual � o valor do ingresso? ");
		Cinema cinema = new Cinema(sala, (double) sc.nextDouble());

		System.out.print("Deseja vender ingresso? ");
		String vender = sc.next().toUpperCase();

		while ("SIM" == vender.intern()) {
			cinema.venderIngresso();
			System.out.print("Deseja vender ingresso? ");
			vender = sc.next().toUpperCase();
		}

		System.out.printf("O faturamento total da sess�o foi de R$ %.2f\n", cinema.calcularFaturamento());

		cinema.finalizaSessao();

		sc.close();

	}

}
