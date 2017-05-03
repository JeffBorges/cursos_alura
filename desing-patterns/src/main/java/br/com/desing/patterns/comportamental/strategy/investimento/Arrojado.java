package br.com.desing.patterns.comportamental.strategy.investimento;

import java.util.Random;

public class Arrojado implements Investimento {

    @Override
    public double calcularRendimento(double valor) {
        double escolhido = new Random().nextDouble();

        if (escolhido <= 0.5) {
            return valor * 0.006;
        } else if (escolhido > 0.5 && escolhido <= 0.8) {
            return valor * 0.03;
        } else {
            // de 81% até 100%
            return valor * 0.05;
        }
    }

}
