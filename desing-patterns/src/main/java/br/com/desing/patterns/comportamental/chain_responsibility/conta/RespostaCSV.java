package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao.Formato;

public class RespostaCSV extends Resposta {

	public RespostaCSV(Resposta proximo) {
		super(proximo);
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.CSV.equals(req.getFormato())) {
			System.out.println(String.format("%s;%.2f", conta.getTitular().getNome(), conta.getSaldo()));
		} else {
			proximo.ifPresent(p -> p.responde(req, conta));			
		}
	}

}
