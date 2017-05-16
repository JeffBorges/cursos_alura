package br.com.desing.patterns.comportamental.template_method;

import br.com.desing.patterns.beans.Item;
import br.com.desing.patterns.beans.Orcamento;
import br.com.desing.patterns.comportamental.strategy.imposto.*;
import br.com.desing.patterns.comportamental.template_method.imposto.ImpostoX;
import br.com.desing.patterns.comportamental.template_method.imposto.ImpostoY;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostos_Test {

    @Test
    public void calcularImpostoXMin() {
        Imposto imposto = new ImpostoX();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.05));
    }

    @Test
    public void calcularImpostoXMax() {
    	Imposto imposto = new ImpostoX();
        Orcamento orcamento = new Orcamento(600.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.07));
    }


    @Test
    public void calcularImpostoYMin() {
        Imposto imposto = new ImpostoY();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.06));
    }
    
    @Test
    public void calcularImpostoYMax() {
        Imposto imposto = new ImpostoY();
        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionarItem(new Item("LAPIS", 150));
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.1));
    }

}
