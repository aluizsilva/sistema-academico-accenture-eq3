package com.accenture.academico.model;

public enum Sexo {
	
	M("Masculino"), F("Feminino"), O("Outros");

	private String sexo;

	Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

}