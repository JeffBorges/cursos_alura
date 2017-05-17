package br.com.desing.patterns.comportamental.template_method.imposto;

import java.util.Collections;

import br.com.desing.patterns.beans.Orcamento;

public class IHIT extends TemplateImpostoCondicional{

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getItens()
				.stream()
				.filter(item -> Collections.frequency(orcamento.getItens(), item)>1)
				.count() > 0;
	}

}
