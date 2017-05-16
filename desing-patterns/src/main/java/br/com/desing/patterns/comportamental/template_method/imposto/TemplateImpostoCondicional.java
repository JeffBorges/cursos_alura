package br.com.desing.patterns.comportamental.template_method.imposto;

import br.com.desing.patterns.beans.Orcamento;
import br.com.desing.patterns.comportamental.strategy.imposto.Imposto;

public abstract class TemplateImpostoCondicional implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
