package com.accenture.academico.model;

public enum TipoPessoa {

	
	ALUNO("Aluno"), PROFESSOR("Professor");

	private String tipo;

	TipoPessoa(String tipoPessoa) {
		this.tipo = tipoPessoa;
	}

	public String getTipoPessoa() {
		return tipo;
	}
	
}
