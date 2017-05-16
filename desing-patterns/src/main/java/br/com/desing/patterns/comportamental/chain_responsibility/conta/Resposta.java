package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
    void setProxima(Resposta proximo);
}

