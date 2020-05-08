package ConverterTemperatura;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de uma temperatura: ");
		double temperatura = sc.nextDouble();
		ConverterTemperatura conversao = new ConverterTemperatura(temperatura);

		System.out.printf("Conversão de Celsius para Fahrenheit...: %.1f%n",
				conversao.celsiusParaFahrenheit(temperatura));
		System.out.printf("Conversão de Fahrenheit para Celsius...: %.1f%n",
				conversao.fahrenheitParaCelsius(temperatura));
		System.out.printf("Conversão de Fahrenheit para Kelvin....: %.1f%n", 
				conversao.fahrenheitParaKelvin(temperatura));
		System.out.printf("Conversão de Kelvin para Fahrenheit....: %.1f%n", 
				conversao.kelvinParaFahrenheit(temperatura));
		System.out.printf("Conversão de Celsius para Kelvin.......: %.1f%n", 
				conversao.celsiusParaKelvin(temperatura));
		System.out.printf("Conversão de Kelvin para Celsius.......: %.1f%n", 
				conversao.kelvinParaCelsius(temperatura));

		sc.close();

	}

}
