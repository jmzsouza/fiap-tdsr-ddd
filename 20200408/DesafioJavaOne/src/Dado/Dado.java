package Dado;
import java.util.Random;

public class Dado {
	
	private int dado1;
	private int dado2;
	private int soma;
	
	public Dado() {
		this.dado1 = 0;
		this.dado2 = 0;
	}

	public int getDado1() {
		return dado1;
	}


	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}


	public int getDado2() {
		return dado2;
	}
	

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}
	
	public int getSoma() {
		return soma;
	}	
	
	public int atirarDados() {
		return new Random().nextInt(6) + 1;
	}
	
	public void jogar() {
		this.dado1 = this.atirarDados();
		this.dado2 = this.atirarDados();
	}
	
	public void somarValores() {
		this.soma = this.dado1 + this.dado2;
	}

}
