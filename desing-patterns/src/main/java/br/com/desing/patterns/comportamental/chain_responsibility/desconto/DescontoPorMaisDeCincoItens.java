package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return this.proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
