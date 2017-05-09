package br.com.desing.patterns.comportamental.chain_responsibility;

import br.com.desing.patterns.beans.Item;
import br.com.desing.patterns.beans.Orcamento;
import br.com.desing.patterns.comportamental.chain_responsibility.desconto.CalculadorDeDescontos;
import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeDescontos_Test {

    @Test
    public void calcularDescontoMaisDeCincoItens() {
        Orcamento orcamento = new Orcamento(1500.0);
        orcamento.adicionarItem(new Item("CANETA", 250.0));
        orcamento.adicionarItem(new Item("LAPIS", 250.0));
        orcamento.adicionarItem(new Item("CADERNO", 250.0));
        orcamento.adicionarItem(new Item("BORRACHA", 250.0));
        orcamento.adicionarItem(new Item("MOCHILA", 250.0));
        orcamento.adicionarItem(new Item("LAPIS DE COR", 250.0));

        double desconto = new CalculadorDeDescontos().calcular(orcamento);

        Assert.assertTrue((orcamento.getValor() * 0.1) == desconto);
    }

    @Test
    public void calcularDescontoMaisDeQuinhentosReais() {
        Orcamento orcamento = new Orcamento(550.0);
        orcamento.adicionarItem(new Item("CANETA", 250.0));
        orcamento.adicionarItem(new Item("LAPIS", 300.0));
        double desconto = new CalculadorDeDescontos().calcular(orcamento);

        Assert.assertTrue((orcamento.getValor() * 0.07) == desconto);
    }

    @Test
    public void calcularDescontoPorVendaLapisECanetas() {
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionarItem(new Item("CANETA", 250.0));
        orcamento.adicionarItem(new Item("LAPIS", 250.0));
        double desconto = new CalculadorDeDescontos().calcular(orcamento);

        Assert.assertTrue((orcamento.getValor() * 0.05) == desconto);
    }

    @Test
    public void calcularSemDesconto() {
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionarItem(new Item("CANETA", 250.0));
        orcamento.adicionarItem(new Item("MOCHILA", 250.0));
        double desconto = new CalculadorDeDescontos().calcular(orcamento);

        Assert.assertTrue(0 == desconto);
    }

}
