package br.com.fiap.bank.domain;

public class Cliente {

	private String nome;
	private int documento;

	public Cliente(String nome, int documento) {
		System.out.println("Construtor do cliente invocado");
		this.nome = nome;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDocuemnto() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

}