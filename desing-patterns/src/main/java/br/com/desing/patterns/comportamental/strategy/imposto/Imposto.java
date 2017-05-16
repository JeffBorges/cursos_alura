package br.com.desing.patterns.comportamental.strategy.imposto;

import br.com.desing.patterns.beans.Orcamento;

public interface Imposto {
    double calcular(Orcamento orcamento);
}
