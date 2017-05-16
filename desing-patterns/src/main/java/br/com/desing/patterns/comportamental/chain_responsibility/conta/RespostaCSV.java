package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao.Formato;

public class RespostaCSV implements Resposta {

	private Resposta proximo;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.CSV.equals(req.getFormato())) {
			System.out.println(String.format("%s;%.2f", conta.getTitular().getNome(), conta.getSaldo()));
		} else {
			proximo.responde(req, conta);			
		}
	}

	@Override
	public void setProxima(Resposta proximo) {
		this.proximo = proximo;
	}

}
