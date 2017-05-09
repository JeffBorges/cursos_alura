package br.com.desing.patterns.comportamental.strategy.imposto;

import br.com.desing.patterns.beans.Orcamento;

public class CalculadorDeImpostos {

    public double calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento.getValor());
    }

}
