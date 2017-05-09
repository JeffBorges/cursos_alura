package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        // não tem proximo
    }
}
