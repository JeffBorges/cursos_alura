package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import java.util.Optional;

import br.com.desing.patterns.beans.Conta;

public abstract class Resposta {
	
	protected Optional<Resposta> proximo;
	
	public Resposta(Resposta proximo) {
		this.proximo = Optional.ofNullable(proximo);
	}
	
	abstract void responde(Requisicao req, Conta conta);
}

