package RestauranteEstoque;
import java.util.Scanner;

public class TesteEstoque {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Produto LightSaber = new Produto("LightSaber", 5, 0, 999, 2400.00);
		System.out.printf("Existem %d %s com valor unitário de R$ %s\n", LightSaber.getQuantidadeAtual(),
				LightSaber.getDescricao(), LightSaber.getPrecoVendaFormatado());
		System.out.printf("Digite a quantidade que deseja comprar: ");
		int quantidade = scan.nextInt();
		
		if (quantidade > 5 || quantidade < 0) {
			System.out.println("Não conseguiremos te ajudar!");
		}
		
		Venda venda = new Venda(LightSaber, quantidade);
		
		System.out.printf("Foi realizada uma venda de %d %s em um valor total de R$ %s", venda.getQuantidade(),
				LightSaber.getDescricao(), venda.calculaValorVenda());

		scan.close();
	}
}
