package br.com.desing.patterns.comportamental.template_method.relatorio;

import java.time.LocalDate;

import br.com.desing.patterns.beans.Banco;
import br.com.desing.patterns.beans.TipoRelatorio;

public class RelatorioComplexo extends TemplateRelatorio {

	public RelatorioComplexo(Relatorio proximo) {
		super(proximo);
	}

	@Override
	protected void gerarCabacalho(Banco banco) {
		System.out.printf("Banco: %s \nEndereço: %s \nTelefone: %s%n", banco.getNome(), banco.getEndereco(),
				banco.getTelefone());
	}

	@Override
	protected void gerarCorpo(Banco banco) {
		System.out.println("_________________________________________________________________________");
		System.out.println("| Titular                       | Agencia   | Conta     | Saldo          |");
		

		banco.getContas().forEach(conta -> {
			System.out.printf("| %-30s| %-10s| %-10s| %-15.2f|%n", conta.getTitular().getNome(), conta.getAgencia(),
					conta.getNumero(), conta.getSaldo());
		});
	}

	@Override
	protected void gerarRodape(Banco banco) {
		System.out.println("_________________________________________________________________________");
		LocalDate data = LocalDate.now();
		System.out.printf("E-mail: %s - Data: %tB %te, %tY", banco.getEmail(), data, data, data);
		
	}

	@Override
	protected boolean ehEsteRelatorio(TipoRelatorio tipo) {
		return TipoRelatorio.COMPLEXO.equals(tipo);
	}

}
