package SistemaProduto;

public class Produto {

	private int qtde;
	private double preco;
	private double desconto;

	public Produto(int qtde, double preco, double desconto) {
		this.qtde = qtde;
		this.preco = preco;
		this.desconto = desconto;
	}

	public double calculaTotal() {
		return qtde * preco * (1 - (desconto / 100));
	}

}
