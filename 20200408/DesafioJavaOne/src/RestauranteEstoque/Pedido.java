package RestauranteEstoque;
import java.text.DecimalFormat;

public class Pedido {

	private String cliente;
	private String ultimoPedido;
	private boolean pedidoPendente;
	private double valorTotal;
	
	public Pedido(String cliente, String ultimoPedido) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
	}

	public Pedido(String cliente, String ultimoPedido, double valorTotal) {
		super();
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
		this.valorTotal = valorTotal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getUltimoPedido() {
		return ultimoPedido;
	}

	public void setUltimoPedido(String ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

	public boolean isPedidoPendente() {
		return pedidoPendente;
	}

	public void setPedidoPendente(boolean pedidoPendente) {
		this.pedidoPendente = pedidoPendente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
    public void fazPedido(String cliente,String ultimoPedido, double valorTotal){
        this.cliente = cliente;
        this.ultimoPedido = ultimoPedido;
        this.valorTotal += valorTotal;
    }
    
    public void entregaPedido(){
        this.pedidoPendente = false;
    }
    
    public String calculaTotal(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(this.valorTotal);
    }
	
	
}
