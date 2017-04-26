package br.com.desing.patterns.comportamental.strategy;

public class ICMS implements Imposto {

    private double taxa = 0.1;

    @Override
    public double calcular(double valor) {
        return valor * taxa;
    }
}
