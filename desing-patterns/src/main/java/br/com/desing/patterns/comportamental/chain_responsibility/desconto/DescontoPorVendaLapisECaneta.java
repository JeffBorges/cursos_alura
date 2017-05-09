package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Orcamento;

public class DescontoPorVendaLapisECaneta implements DescontoPorVendaCasada{

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {

        if (existeItens(orcamento, "LAPIS", "CANETA")) {
            return orcamento.getValor() * 0.05;
        }

        return this.proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
