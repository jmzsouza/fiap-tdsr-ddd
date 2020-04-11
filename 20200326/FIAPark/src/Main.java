import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a placa do ve�culo: ");
		String placa = scan.nextLine();
		
		System.out.println("Informe a marca do ve�culo: ");
		String marca = scan.nextLine();
		
		System.out.println("Informe o modelo do ve�culo: ");
		String modelo = scan.nextLine();
		
		Veiculo veiculo = new Veiculo(placa, marca, modelo);
		Ticket ticket = new Ticket(veiculo);
		
		System.err.println(ticket);

		System.out.printf("Veiculo %s %s com placa %s, estacionado na data %s com sucesso.\n", 
				ticket.getVeiculo().getMarca(), ticket.getVeiculo().getModelo(), ticket.getVeiculo().getPlaca(), ticket.entradaParaTexto());
		
		try {
			Thread.sleep(60000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ticket.registraSaida();
		
		System.err.println(ticket);
		
		System.out.printf("Veiculo %s %s com placa %s, saiu na data %s.%nO valor recebido foi de R$ %.2f.%n", 
				ticket.getVeiculo().getMarca(), ticket.getVeiculo().getModelo(), ticket.getVeiculo().getPlaca(), ticket.saidaParaTexto(),
				ticket.getValor());		
		
		scan.close();
	}

}
