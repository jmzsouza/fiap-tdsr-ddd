package br.com.fiap.bank;
import br.com.fiap.bank.domain.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(27, 4552);
		primeiraConta.deposita(4000);

		System.out.println(primeiraConta.getSaldo());

		Conta segundaConta = new Conta(35, 3664);
		segundaConta.deposita(2000);
		boolean sacou = segundaConta.saca(350);

		if (sacou) {
			System.out.println("Saque efetuado com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(segundaConta.getSaldo());

		if (primeiraConta.transfere(2300, segundaConta)) {
			System.out.println("Transferência efetuada com sucesso.");
		} else {
			System.err.println("Saldo insuficiente.");
		}
		System.out.println(primeiraConta.getSaldo());
		System.out.println(segundaConta.getSaldo());

	}
}