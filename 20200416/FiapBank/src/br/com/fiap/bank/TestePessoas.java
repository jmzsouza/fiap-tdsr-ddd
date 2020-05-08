package br.com.fiap.bank;

import br.com.fiap.bank.domain.Cliente;
import br.com.fiap.bank.domain.PessoaFisica;
import br.com.fiap.bank.domain.PessoaJuridica;

public class TestePessoas {

	public static void main(String[] args) {

		PessoaJuridica pj = new PessoaJuridica("Alex", 545454);
		System.out.println(pj.getNome());
		System.out.println(pj.getDocuemnto());

		PessoaFisica pf = new PessoaFisica("Joao", 535353, "1TDSR");
		System.out.println(pf.getNome());
		System.out.println(pf.getDocuemnto());

		Cliente clientePJ = new PessoaJuridica("Maria", 6565);
		System.out.println(clientePJ.getNome());
		System.out.println(clientePJ.getDocuemnto());
		System.out.println(clientePJ.getClass());

		Cliente clientePF = new PessoaFisica("Rita", 3232, "1TDSR");
		System.out.println(clientePF.getNome());
		System.out.println(clientePF.getDocuemnto());
		System.out.println(clientePF.getClass());
	}

}
