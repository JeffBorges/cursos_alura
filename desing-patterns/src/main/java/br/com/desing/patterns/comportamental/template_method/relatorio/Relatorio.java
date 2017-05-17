package br.com.desing.patterns.comportamental.template_method.relatorio;

import java.util.Optional;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.TipoRelatorio;

public abstract class Relatorio {

	protected Optional<Relatorio> proximo;
	
	public Relatorio(Relatorio proximo) {
		this.proximo = Optional.ofNullable(proximo);
	}
	
	public abstract void gerar(Banco banco, TipoRelatorio tipo);
	
}
