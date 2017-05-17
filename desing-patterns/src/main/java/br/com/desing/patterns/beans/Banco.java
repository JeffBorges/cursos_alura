package br.com.desing.patterns.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private List<Conta> contas;

	public Banco(String nome, String telefone, String endereco, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
}