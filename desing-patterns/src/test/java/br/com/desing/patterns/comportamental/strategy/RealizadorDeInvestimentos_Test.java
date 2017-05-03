package br.com.desing.patterns.comportamental.strategy;

import br.com.desing.patterns.comportamental.strategy.investimento.*;
import org.junit.Assert;
import org.junit.Test;

public class RealizadorDeInvestimentos_Test {

    @Test
    public void realizaInvestimento_Conservador_Test() {
        Conta conta = new Conta(1000.0);
        Investimento investimento = new Conservador();
        new RealizadorDeInvestimentos().realizaInvestimento(conta, investimento);
        double lucro = conta.getSaldo() - 1000;
        double lucroEsperado = ((1000.0*0.008)*0.75);
        Assert.assertTrue(lucro == lucroEsperado);
    }

    @Test
    public void realizaInvestimento_Moderado_Test() {
        Conta conta = new Conta(1000.0);
        Investimento investimento = new Moderado();
        new RealizadorDeInvestimentos().realizaInvestimento(conta, investimento);
        double lucro = conta.getSaldo() - 1000;
        double lucroMinimoEsperado = ((1000.0*0.007)*0.75);
        double lucroMaximoEsperado = ((1000.0*0.025)*0.75);
        Assert.assertTrue(lucro == lucroMinimoEsperado || lucro == lucroMaximoEsperado);
    }

    @Test
    public void realizaInvestimento_Arrojado_Test() {
        Conta conta = new Conta(1000.0);
        Investimento investimento = new Arrojado();
        new RealizadorDeInvestimentos().realizaInvestimento(conta, investimento);
        double lucro = conta.getSaldo() - 1000;
        double lucroMinimoEsperado = ((1000.0*0.006)*0.75);
        double lucroModeradoEsperado = ((1000.0*0.03)*0.75);
        double lucroMaximoEsperado = ((1000.0*0.05)*0.75);
        Assert.assertTrue(lucro == lucroMinimoEsperado || lucro == lucroModeradoEsperado || lucro == lucroMaximoEsperado);
    }
}
