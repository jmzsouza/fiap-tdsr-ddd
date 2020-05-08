package RestauranteEstoque;
import java.text.DecimalFormat;

public class Venda {
	
	private Produto produto;
	private int quantidade;
	private double valorVenda;
	
	public Venda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}	
	
	public Venda(Produto produto, int quantidade, double valorVenda) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
    public String calculaValorVenda(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        this.valorVenda = (this.quantidade*this.produto.getPrecoVenda());
        return (df.format(valorVenda));

    }	
	
}
