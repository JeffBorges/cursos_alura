package br.com.desing.patterns.comportamental.strategy.investimento;

import java.util.Random;

public class Moderado implements Investimento {

    @Override
    public double calcularRendimento(double valor) {
        boolean escolhido = new Random().nextDouble() > 0.5;
        if (escolhido) {
            return valor * 0.025;
        }
        return valor * 0.007;
    }

}
