package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public class SemResposta extends Resposta{

	public SemResposta() {
		super(null);
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		// não tem ação
	}

}
