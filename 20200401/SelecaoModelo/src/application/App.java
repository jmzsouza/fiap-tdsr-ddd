package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Modelo;
import entities.SelecaoModelo;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da modelo 1: ");
		String nome = sc.nextLine();
		System.out.print("Digite a altura da modelo 1: ");
		double altura = sc.nextDouble();
		System.out.print("Digite o peso da modelo 1: ");
		double peso = sc.nextDouble();
		Modelo modelo1 = new Modelo(nome, altura, peso);
		
		sc.nextLine();
		System.out.print("Digite o nome da modelo 2: ");
		nome = sc.nextLine();
		System.out.print("Digite a altura da modelo 2: ");
		altura = sc.nextDouble();
		System.out.print("Digite o peso da modelo 2: ");
		peso = sc.nextDouble();
		Modelo modelo2 = new Modelo(nome, altura, peso);

		SelecaoModelo selecao = new SelecaoModelo(modelo1, modelo2);

		System.out.println(selecao.menorIMC());
		System.out.println(selecao.maisAlta());
		System.out.println(selecao.maisMagra());
		System.out.println(selecao.melhorPerfil());

		sc.close();

	}

}
