package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Orcamento;

public class CalculadorDeDescontos {

    public double calcular(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaLapisECaneta();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconta(orcamento);
    }

}
