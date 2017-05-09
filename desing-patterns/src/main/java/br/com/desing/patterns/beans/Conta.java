package br.com.desing.patterns.beans;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
