package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Jogador;
import entities.JogoDados;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do Jogador 1? ");
		Jogador jogador1 = new Jogador(sc.nextLine());
		System.out.print("Digite o nome do Jogador 2? ");
		Jogador jogador2 = new Jogador(sc.nextLine());
		JogoDados jogo = new JogoDados(jogador1, jogador2);

		System.out.print("Qual a quantidade de rodadas? ");
		int rodadas = sc.nextInt();

		for (int i = 1; i <= rodadas; i++) {
			jogo.jogar();
			System.out.println(jogo.vencedor());
		}

		System.out.println(jogo.verPlacar());

		jogo.reincia();

		sc.close();
	}

}
