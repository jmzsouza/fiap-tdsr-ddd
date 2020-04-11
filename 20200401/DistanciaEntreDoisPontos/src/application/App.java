package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DistanciaEntreDoisPontos;
import entities.Ponto;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor x do ponto 1: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor y do ponto 1: ");
		int y = sc.nextInt();
		Ponto ponto1 = new Ponto(x, y);
		System.out.print("Digite o valor x do ponto 2: ");
		x = sc.nextInt();
		System.out.print("Digite o valor y do ponto 2: ");
		y = sc.nextInt();
		Ponto ponto2 = new Ponto(x, y);
		DistanciaEntreDoisPontos distancia = new DistanciaEntreDoisPontos(ponto1, ponto2);

		System.out.printf("Distância entre os dois pontos: %.5f%n", distancia.calcularDistancia());

		sc.close();

	}

}
