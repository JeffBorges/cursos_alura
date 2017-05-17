package br.com.desing.patterns.comportamental.template_method.relatorio;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.TipoRelatorio;

public class GeradorRelatorio {

	public void gerar(Banco banco, TipoRelatorio tipo) {
		Relatorio r1 = new RelatorioSimples();
		Relatorio r2 = new RelatorioComplexo(r1);
		r2.gerar(banco, tipo);
	}
	
}
