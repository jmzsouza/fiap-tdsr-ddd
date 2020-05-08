package Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			System.out.printf("Digite o comprimento do cateto adjacente: ");
			double catetoA = sc.nextDouble();
			System.out.printf("Digite o comprimento do cateto oposto: ");
			double catetoB = sc.nextDouble();
			Triangulo calc = new Triangulo(catetoA, catetoB);
			System.out.printf("O tamanho da hipotenusa é: %.5f", calc.calcularHipotenusa());
		
		sc.close();

	}

}
