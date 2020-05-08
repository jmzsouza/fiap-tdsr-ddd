package br.com.fiap.bank.domain;

public class PessoaJuridica extends Cliente{

	public PessoaJuridica(String nome, int documento) {
		super(nome, documento);
	}

	private String nomeFantasia;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
