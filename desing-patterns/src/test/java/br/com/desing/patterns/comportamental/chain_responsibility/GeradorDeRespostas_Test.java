package br.com.desing.patterns.comportamental.chain_responsibility;

import org.junit.Test;

import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.beans.Pessoa;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.GeradorDeRespostas;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao;
import br.com.desing.patterns.comportamental.chain_responsibility.conta.Requisicao.Formato;

public class GeradorDeRespostas_Test {

	@Test
	public void respostaXML_Test() {
		Conta conta = new Conta(500.0, new Pessoa("João"));
		Requisicao req = new Requisicao(Formato.XML);
		
		new GeradorDeRespostas().gerar(req, conta);	
	}
	
	@Test
	public void respostaCSV_Test() {
		Conta conta = new Conta(500.0, new Pessoa("João"));
		Requisicao req = new Requisicao(Formato.CSV);
		
		new GeradorDeRespostas().gerar(req, conta);	
	}
	
	@Test
	public void respostaPorcento_Test() {
		Conta conta = new Conta(500.0, new Pessoa("João"));
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		new GeradorDeRespostas().gerar(req, conta);	
	}
	
}
