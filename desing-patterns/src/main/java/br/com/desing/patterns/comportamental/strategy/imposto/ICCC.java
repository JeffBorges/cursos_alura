package br.com.desing.patterns.comportamental.strategy.imposto;

public class ICCC implements Imposto{

    @Override
    public double calcular(double valor) {
        if (valor < 1000) {
            return 0.05 * valor;
        } else if (valor >= 1000 && valor <= 3000) {
            return 0.07 * valor;
        } else {
            return (0.08 * valor) + 30.0;
        }
    }

}
