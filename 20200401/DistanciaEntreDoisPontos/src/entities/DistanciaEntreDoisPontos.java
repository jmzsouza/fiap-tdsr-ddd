package entities;

public class DistanciaEntreDoisPontos {

	private Ponto ponto1;
	private Ponto ponto2;

	public DistanciaEntreDoisPontos(Ponto ponto1, Ponto ponto2) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}

	public Ponto getPonto1() {
		return ponto1;
	}

	public void setPonto1(Ponto ponto1) {
		this.ponto1 = ponto1;
	}

	public Ponto getPonto2() {
		return ponto2;
	}

	public void setPonto2(Ponto ponto2) {
		this.ponto2 = ponto2;
	}

	public double calcularDistancia() {

		double distancia = Math.sqrt(Math.pow(Math.abs(this.ponto2.getX() - this.ponto1.getX()), 2)
				+ Math.pow(Math.abs(this.ponto2.getY() - this.ponto1.getY()), 2));

		return distancia;
	}

}
