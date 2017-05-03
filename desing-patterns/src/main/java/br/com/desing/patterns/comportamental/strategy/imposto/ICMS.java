package br.com.desing.patterns.comportamental.strategy.imposto;

public class ICMS implements Imposto {

    private double taxa = 0.05;

    @Override
    public double calcular(double valor) {
        return (valor * taxa) + 50;
    }
}
