package br.com.desing.patterns.comportamental.strategy.imposto;

import br.com.desing.patterns.beans.Orcamento;

public class ICCC implements Imposto{

    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getValor() < 1000) {
            return 0.05 * orcamento.getValor();
        } else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
            return 0.07 * orcamento.getValor();
        } else {
            return (0.08 * orcamento.getValor()) + 30.0;
        }
    }

}
