package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public class SemResposta implements Resposta{

	@Override
	public void responde(Requisicao req, Conta conta) {
		// não tem ação
	}

	@Override
	public void setProxima(Resposta proximo) {
		// não tem proximo
	}

}
