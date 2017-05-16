package br.com.desing.patterns.comportamental.chain_responsibility.conta;

import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao.Formato;

public class RespostaPorcento extends Resposta{

	public RespostaPorcento(Resposta proximo) {
		super(proximo);
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.PORCENTO.equals(req.getFormato())) {
			System.out.println(String.format("%s%%%.2f", conta.getTitular().getNome(), conta.getSaldo()));
		} else {
			proximo.responde(req, conta);			
		}
	}
	
}
