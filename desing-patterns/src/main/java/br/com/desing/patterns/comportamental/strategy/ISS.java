package br.com.desing.patterns.comportamental.strategy;

public class ISS implements Imposto {

    private double taxa = 0.06;

    @Override
    public double calcular(double valor) {
        return valor * taxa;
    }
}
