package br.com.desing.patterns.comportamental.strategy.investimento;

import br.com.desing.patterns.beans.Conta;

public class RealizadorDeInvestimentos {

    public void realizaInvestimento(Conta conta, Investimento investimento) {
        double rendimento = investimento.calcularRendimento(conta.getSaldo());
        double lucro = rendimento * 0.75;
        conta.depositar(lucro);
        System.out.println(conta.getSaldo());
    }

}
