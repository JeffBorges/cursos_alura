package br.com.desing.patterns.beans;

public class Conta {

    private double saldo;
	private Pessoa titular;
	private String agencia;
	private String numero;

    public Conta(double saldo, Pessoa titular) {
        this.saldo = saldo;
		this.titular = titular;
    }
    
    public Conta(double saldo, Pessoa titular, String agencia, String numero) {
        this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
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

	public String getAgencia() {
		return agencia;
	}
	
	public String getNumero() {
		return numero;
	}
}
