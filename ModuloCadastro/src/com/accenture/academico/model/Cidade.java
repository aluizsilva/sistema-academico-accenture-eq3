package com.accenture.academico.model;

public enum Cidade {

	RECIFE("Recife"),
	JABOATAO("Jaboat�o"),
	OLINDA("Olinda"),
	PAULISTA("Paulista"),
	CARUARU("Caruaru"),
	CARPINA("Carpina"),
	GARANHUNS("Garanhuns"),
	GRAVATA("Gravat�"),
	TAMANDARE("Tamandar�"),
	BUENOSAIRES("Buenos Aires");

	private String cidade;

	Cidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

}
