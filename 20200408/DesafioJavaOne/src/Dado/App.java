package Dado;
public class App {

	public static void main(String[] args) {
		
		Dado dado = new Dado();
		
		dado.jogar();
		dado.somarValores();
		System.out.println("A soma dos dados é: " + dado.getSoma());
		
	}

}
