package br.com.desing.patterns.comportamental.template_method;

import org.junit.Test;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.Conta;
import br.com.desing.patterns.beans.Pessoa;
import br.com.desing.patterns.beans.TipoRelatorio;
import br.com.desing.patterns.comportamental.template_method.relatorio.GeradorRelatorio;

public class GeradorRelatorio_Test {

	@Test
	public void gerarSimples_Test() {
		new GeradorRelatorio().gerar(criarBanco(), TipoRelatorio.SIMPLES);
	}
	
	@Test
	public void gerarComplexo_Test() {
		new GeradorRelatorio().gerar(criarBanco(), TipoRelatorio.COMPLEXO);
	}
	
	private Banco criarBanco(){
		Banco banco = new Banco("Banco Z", "565.546.954", "Rua 1, n 1", "contato@bancoz.com.br");
		banco.adicionarConta(new Conta(210, new Pessoa("João"), "123", "123456-5"));
		banco.adicionarConta(new Conta(5410.5, new Pessoa("Maria"), "123", "543456-5"));
		banco.adicionarConta(new Conta(85.56, new Pessoa("Lucas"), "1234", "12345-5"));
		banco.adicionarConta(new Conta(542.68, new Pessoa("Ana"), "1234", "123458-5"));
		return banco;
	}
	
}
