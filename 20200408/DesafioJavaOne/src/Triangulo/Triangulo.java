package Triangulo;

public class Triangulo {

	private double catetoA;
	private double catetoB;
	private double hipotenusa;

	public Triangulo(double catetoA, double catetoB) {
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}

	public double getcatetoA() {
		return catetoA;
	}

	public void setcatetoA(double catetoA) {
		this.catetoA = catetoA;
	}

	public double getcatetoB() {
		return catetoB;
	}

	public void setcatetoB(double catetoB) {
		this.catetoB = catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	public double calcularHipotenusa() {
		return Math.sqrt((Math.pow(Math.abs(catetoA), 2) + Math.pow(Math.abs(catetoB), 2)));
	}

}
