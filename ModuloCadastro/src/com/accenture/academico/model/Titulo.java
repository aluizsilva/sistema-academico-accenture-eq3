package com.accenture.academico.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "titulo")
public class Titulo {

	private int id;
	private String titulacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	
}
