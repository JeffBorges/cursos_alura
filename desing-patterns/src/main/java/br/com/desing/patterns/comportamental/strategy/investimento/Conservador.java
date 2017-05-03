package br.com.desing.patterns.comportamental.strategy.investimento;

public class Conservador implements Investimento {

    @Override
    public double calcularRendimento(double valor) {
        return valor * 0.008;
    }

}
