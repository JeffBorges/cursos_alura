package br.com.desing.patterns.comportamental.template_method.relatorio;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.TipoRelatorio;

public class RelatorioSimples extends TemplateRelatorio {

	public RelatorioSimples() {
		super(null);
	}

	@Override
	protected void gerarCabacalho(Banco banco) {
		System.out.printf("Banco: %s - Telefone: %s%n", banco.getNome(), banco.getTelefone());
	}

	@Override
	protected void gerarCorpo(Banco banco) {
		System.out.println("_________________________________________________");
		System.out.println("| Titular                       | Saldo          |");
		
		
		banco.getContas().forEach(conta-> {
			System.out.printf("| %-30s| %15.2f|%n", conta.getTitular().getNome(), conta.getSaldo());
		});
	}

	@Override
	protected void gerarRodape(Banco banco) {
		System.out.println("_________________________________________________");
		System.out.printf("Banco: %s \nTelefone: %s%n", banco.getNome(), banco.getTelefone());
	}

	@Override
	protected boolean ehEsteRelatorio(TipoRelatorio tipo) {
		return TipoRelatorio.SIMPLES.equals(tipo);
	}
	
}
