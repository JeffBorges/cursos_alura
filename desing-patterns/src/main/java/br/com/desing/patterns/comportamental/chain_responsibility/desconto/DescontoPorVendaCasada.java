package br.com.desing.patterns.comportamental.chain_responsibility.desconto;

import br.com.desing.patterns.beans.Item;
import br.com.desing.patterns.beans.Orcamento;

import java.util.Arrays;
import java.util.stream.Collectors;

public interface DescontoPorVendaCasada extends Desconto {

    default boolean existeItens(Orcamento orcamento, String... nomeDosItens) {
        if (nomeDosItens.length < 2) {
            return false;
        }

        return orcamento.getItens()
                .stream()
                .map(Item::getNome)
                .collect(Collectors.toSet())
                .containsAll(Arrays.asList(nomeDosItens));
    }
}
