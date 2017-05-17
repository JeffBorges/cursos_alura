package br.com.desing.patterns.comportamental.template_method.relatorio;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.TipoRelatorio;

public abstract class TemplateRelatorio extends Relatorio {

	public TemplateRelatorio(Relatorio proximo) {
		super(proximo);
	}

	public void gerar(Banco banco, TipoRelatorio tipo) {
		if (ehEsteRelatorio(tipo)) {
			gerarCabacalho(banco);
			gerarCorpo(banco);
			gerarRodape(banco);
		} else {
			proximo.ifPresent(p -> p.gerar(banco, tipo));
		}
		
	}

	protected abstract boolean ehEsteRelatorio(TipoRelatorio tipo);

	protected abstract void gerarCabacalho(Banco banco);

	protected abstract void gerarCorpo(Banco banco);

	protected abstract void gerarRodape(Banco banco);
	
}
