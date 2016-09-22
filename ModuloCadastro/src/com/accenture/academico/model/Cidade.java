package com.accenture.academico.model;

public enum Cidade {

	RECIFE("Recife"),
	JABOATAO("Jaboatão"),
	OLINDA("Olinda"),
	PAULISTA("Paulista"),
	CARUARU("Caruaru"),
	CARPINA("Carpina"),
	GARANHUNS("Garanhuns"),
	GRAVATA("Gravatá"),
	TAMANDARE("Tamandaré"),
	BUENOSAIRES("Buenos Aires");

	private String cidade;

	Cidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

}
