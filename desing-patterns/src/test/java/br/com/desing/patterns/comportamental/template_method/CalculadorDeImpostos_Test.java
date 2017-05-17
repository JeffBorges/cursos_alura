package br.com.desing.patterns.comportamental.template_method;

import br.com.desing.patterns.beans.Item;
import br.com.desing.patterns.beans.Orcamento;
import br.com.desing.patterns.comportamental.strategy.imposto.*;
import br.com.desing.patterns.comportamental.template_method.imposto.ICPP;
import br.com.desing.patterns.comportamental.template_method.imposto.IHIT;
import br.com.desing.patterns.comportamental.template_method.imposto.IKCV;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostos_Test {

    @Test
    public void calcularICPPMin() {
        Imposto imposto = new ICPP();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.05));
    }

    @Test
    public void calcularICPPMax() {
    	Imposto imposto = new ICPP();
        Orcamento orcamento = new Orcamento(600.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.07));
    }


    @Test
    public void calcularIKCVMin() {
        Imposto imposto = new IKCV();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.06));
    }
    
    @Test
    public void calcularIKCVMax() {
        Imposto imposto = new IKCV();
        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionarItem(new Item("LAPIS", 150));
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.1));
    }

    @Test
    public void calcularIHITMin() {
        Imposto imposto = new IHIT();
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionarItem(new Item("LAPIS", 150));
        orcamento.adicionarItem(new Item("CADERNO", 150));
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == (orcamento.getValor() * 0.02));
    }
    
    @Test
    public void calcularIHITMax() {
        Imposto imposto = new IHIT();
        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionarItem(new Item("LAPIS", 150));
        orcamento.adicionarItem(new Item("LAPIS", 150));
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == ((orcamento.getValor() * 0.13) + 100));
    }
    
}
