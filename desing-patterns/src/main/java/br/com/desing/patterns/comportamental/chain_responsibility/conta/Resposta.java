package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public abstract class Resposta {
	
	protected Resposta proximo;
	
	public Resposta(Resposta proximo) {
		this.proximo = proximo;
	}
	
	abstract void responde(Requisicao req, Conta conta);
}

