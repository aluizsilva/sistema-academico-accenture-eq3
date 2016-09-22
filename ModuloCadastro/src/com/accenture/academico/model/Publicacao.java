package com.accenture.academico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "publicacao")
public class Publicacao {

	@Id
	private int id;
	@Column
	private String tipoPublicacao;
	@Column
	private String descricaoPublicacao;
	@JoinColumn(name = "fk_aluno")
	private Aluno idAluno;
	@JoinColumn(name = "fk_professor")
	private Professor idProfessor;
	@JoinColumn(name = "fk_meiocomunicacao")
	private MeioComunicacao meioComunicacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoPublicacao() {
		return tipoPublicacao;
	}

	public void setTipoPublicacao(String tipoPublicacao) {
		this.tipoPublicacao = tipoPublicacao;
	}

	public String getDescricaoPublicacao() {
		return descricaoPublicacao;
	}

	public void setDescricaoPublicacao(String descricaoPublicacao) {
		this.descricaoPublicacao = descricaoPublicacao;
	}

	public Aluno getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Aluno idAluno) {
		this.idAluno = idAluno;
	}

	public Professor getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Professor idProfessor) {
		this.idProfessor = idProfessor;
	}

	public MeioComunicacao getMeioComunicacao() {
		return meioComunicacao;
	}

	public void setMeioComunicacao(MeioComunicacao meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

}
