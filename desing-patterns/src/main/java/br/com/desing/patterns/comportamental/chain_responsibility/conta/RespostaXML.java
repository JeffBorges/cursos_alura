package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao.Formato;

public class RespostaXML implements Resposta {

	private Resposta proximo;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.XML.equals(req.getFormato())) {
			System.out.println(String.format("<conta><titular>%s/titular><saldo>%.2f</saldo></conta>",
					conta.getTitular().getNome(), conta.getSaldo()));
		} else {
			proximo.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta proximo) {
		this.proximo = proximo;
	}

}
