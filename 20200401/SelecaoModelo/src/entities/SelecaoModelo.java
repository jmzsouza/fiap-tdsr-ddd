package entities;

public class SelecaoModelo {

	private Modelo modelo1;
	private Modelo modelo2;
	private int pontos1;
	private int pontos2;

	public SelecaoModelo(Modelo modelo1, Modelo modelo2) {
		this.modelo1 = modelo1;
		this.modelo2 = modelo2;
		this.pontos1 = 0;
		this.pontos2 = 0;
	}

	public Modelo getModelo1() {
		return modelo1;
	}

	public void setModelo1(Modelo modelo1) {
		this.modelo1 = modelo1;
	}

	public Modelo getModelo2() {
		return modelo2;
	}

	public void setModelo2(Modelo modelo2) {
		this.modelo2 = modelo2;
	}

	public int getPontos1() {
		return pontos1;
	}

	public void setPontos1(int pontos1) {
		this.pontos1 = pontos1;
	}

	public int getPontos2() {
		return pontos2;
	}

	public void setPontos2(int pontos2) {
		this.pontos2 = pontos2;
	}

	public String menorIMC() {
		if (this.modelo1.calcularIMC() < this.modelo2.calcularIMC()) {
			this.pontos1++;
			return "A " + this.modelo1.getNome() + " tem o menor IMC.";
		} else {
			this.pontos2++;
			return "A " + this.modelo2.getNome() + " tem o menor IMC.";
		}
	}

	public String maisAlta() {
		if (this.modelo1.getAltura() > this.modelo2.getAltura()) {
			this.pontos1++;
			return "A " + this.modelo1.getNome() + " é a modelo mais alta.";
		} else {
			this.pontos2++;
			return "A " + this.modelo2.getNome() + " é a modelo mais alta.";
		}
	}

	public String maisMagra() {
		if (this.modelo1.getPeso() < this.modelo2.getPeso()) {
			this.pontos1++;
			return "A " + this.modelo1.getNome() + " é a modelo mais magra.";
		} else {
			this.pontos2++;
			return "A " + this.modelo2.getNome() + " é a modelo mais magra.";
		}
	}

	public String melhorPerfil() {
		if (this.pontos1 > this.pontos2) {
			return "A " + this.modelo1.getNome()  + " obteve: "+ this.pontos1 + " pontos, portanto tem o melhor perfil.";
		} else {
			return "A " + this.modelo2.getNome()  + " obteve: "+ this.pontos2 + " pontos, portanto tem o melhor perfil.";
		}
	}

}
