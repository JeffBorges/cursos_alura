package br.com.desing.patterns.comportamental.strategy.imposto;

import br.com.desing.patterns.beans.Orcamento;

public class ICMS implements Imposto {

    private double taxa = 0.05;

    @Override
    public double calcular(Orcamento orcamento) {
        return (orcamento.getValor() * taxa) + 50;
    }
}
