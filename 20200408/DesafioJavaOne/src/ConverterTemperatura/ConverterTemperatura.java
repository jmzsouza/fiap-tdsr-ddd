package ConverterTemperatura;

public class ConverterTemperatura {

	public static final double K = 273.15;
	public static final double F = 32.0;
	public static final double AUX1 = 9.0 / 5.0;
	public static final double AUX2 = 5.0 / 9.0;

	private double temperatura;

	public ConverterTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double celsiusParaFahrenheit(double temperatura) {
		return (temperatura * AUX1) + F;
	}

	public double fahrenheitParaCelsius(double temperatura) {
		return (temperatura - F) * AUX2;
	}

	public double fahrenheitParaKelvin(double temperatura) {
		return (temperatura - F) * AUX2 + K;
	}

	public double kelvinParaFahrenheit(double temperatura) {
		return (temperatura - K) * AUX1 + F;
	}

	public double celsiusParaKelvin(double temperatura) {
		return temperatura + K;
	}

	public double kelvinParaCelsius(double temperatura) {
		return temperatura - K;
	}

}
