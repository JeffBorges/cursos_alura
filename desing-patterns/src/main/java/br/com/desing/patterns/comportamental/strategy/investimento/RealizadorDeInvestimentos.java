package br.com.desing.patterns.comportamental.strategy.investimento;

public class RealizadorDeInvestimentos {

    public void realizaInvestimento(Conta conta, Investimento investimento) {
        double rendimento = investimento.calcularRendimento(conta.getSaldo());
        double lucro = rendimento * 0.75;
        conta.depositar(lucro);
        System.out.println(conta.getSaldo());
    }

}
