package br.com.desing.patterns.beans;

public class Conta {

    private double saldo;
	private Pessoa titular;

    public Conta(double saldo, Pessoa titular) {
        this.saldo = saldo;
		this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

	public Pessoa getTitular() {
		return titular;
	}
    
}
