package br.com.desing.patterns.comportamental.strategy;

public class CalculadorDeImpostos {

    public double calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento.getValor());
    }

}
