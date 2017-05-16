package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public class GeradorDeRespostas {

	public void gerar(Requisicao req, Conta conta) {
		Resposta r1 = new RespostaCSV();
		Resposta r2 = new RespostaPorcento();
		Resposta r3 = new RespostaXML();
		Resposta r4 = new SemResposta();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
		
		r1.responde(req, conta);
	}
	
}
