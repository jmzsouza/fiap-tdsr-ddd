package entities;

public class Cinema {

	private double precoIngresso;
	private Sala sala; // TODO transformar em uma lista posteriormente

	public Cinema(Sala sala, double precoIngresso) {
		this.sala = sala;
		this.precoIngresso = precoIngresso;
	}

	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public void venderIngresso() {
		this.sala.ocupaLugar();
	}

	public double calcularFaturamento() {
		return this.sala.getLugaresOcupados() * this.precoIngresso;
	}

	public void finalizaSessao() {
		this.sala.esvazia();
	}

}
