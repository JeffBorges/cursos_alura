package br.com.desing.patterns.comportamental.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostos_Test {

    @Test
    public void calcularICMS() {
        Imposto imposto = new ICMS();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == imposto.calcular(orcamento.getValor()));
    }

    @Test
    public void calcularISS() {
        Imposto imposto = new ISS();
        Orcamento orcamento = new Orcamento(500.0);
        double valorComImposto = new CalculadorDeImpostos().calcular(orcamento, imposto);
        Assert.assertTrue(valorComImposto == imposto.calcular(orcamento.getValor()));
    }

}
