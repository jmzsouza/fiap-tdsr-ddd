package RestauranteEstoque;
import java.util.Locale;
import java.util.Scanner;

public class TesteRestaurante {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Informe o nome do cliente: ");
		String cliente = scan.nextLine();
		System.out.printf("Informe o pedido do cliente: ");
		String ultimoPedido = scan.nextLine();
		Pedido pedido = new Pedido(cliente, ultimoPedido);
		System.out.printf("Informe o valor desse pedido: ");
		double valorTotal = scan.nextDouble();
		
		pedido.fazPedido(cliente, ultimoPedido, valorTotal);
		pedido.entregaPedido();
		pedido.calculaTotal();
		
		System.out.printf("%s pediu %s no valor de R$ %s\nO pedido está pendente? %b", pedido.getCliente(),
				pedido.getUltimoPedido(), pedido.calculaTotal(), pedido.isPedidoPendente());
		
		scan.close();
	}
}
