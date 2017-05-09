package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }
        return this.proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
