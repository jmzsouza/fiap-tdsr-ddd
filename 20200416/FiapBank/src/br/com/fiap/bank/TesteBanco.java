package br.com.fiap.bank;
import br.com.fiap.bank.domain.Cliente;
import br.com.fiap.bank.domain.Conta;

public class TesteBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("James", 4552);
		Conta conta1 = new Conta(27, 4552, cliente);
		System.out.println(Conta.getTotalContas());
		Conta conta2 = new Conta(35, 3664, cliente);
		System.out.println(Conta.getTotalContas());
		Conta conta3 = new Conta(45, 2129, cliente);
		System.out.println(Conta.getTotalContas());

		conta1.setTitular(cliente);
		conta1.deposita(350);

		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getSaldo());

		conta2.setTitular(cliente);
		conta2.deposita(650);

		System.out.println(conta2.getTitular().getNome());
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		System.out.println(conta2.getSaldo());

		conta3.setTitular(cliente);
		conta3.deposita(550);

		System.out.println(conta3.getTitular().getNome());
		System.out.println(conta3.getAgencia());
		System.out.println(conta3.getNumero());
		System.out.println(conta3.getSaldo());

	}

}