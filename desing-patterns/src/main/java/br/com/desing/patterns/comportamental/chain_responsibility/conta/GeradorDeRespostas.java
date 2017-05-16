package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;

public class GeradorDeRespostas {

	public void gerar(Requisicao req, Conta conta) {
		Resposta r4 = new SemResposta();
		Resposta r3 = new RespostaXML(r4);
		Resposta r2 = new RespostaPorcento(r3);
		Resposta r1 = new RespostaCSV(r2);
		
		r1.responde(req, conta);
	}
	
}
