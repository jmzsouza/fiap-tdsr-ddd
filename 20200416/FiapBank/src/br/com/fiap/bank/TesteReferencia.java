package br.com.fiap.bank;
import br.com.fiap.bank.domain.Conta;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta conta = new Conta(27, 4552);
		conta.deposita(800);
		System.out.println(conta.getSaldo());

		Conta novaConta = conta;
		System.out.println(novaConta.getSaldo());

		novaConta.deposita(650);
		System.out.println(conta.getSaldo());
		System.out.println(novaConta.getSaldo());

		System.out.println(conta);
		System.out.println(novaConta);
	}
}