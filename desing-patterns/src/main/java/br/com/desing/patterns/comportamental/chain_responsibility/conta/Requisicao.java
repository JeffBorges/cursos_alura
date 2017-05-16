package br.com.desing.patterns.comportamental.chain_responsibility.conta;

public class Requisicao {

	public enum Formato {
		XML, CSV, PORCENTO
	}

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}
