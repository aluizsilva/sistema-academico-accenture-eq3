package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@ManagedBean(name = "aluno")
/*@PrimaryKeyJoinColumn(name="id")*/
public class Aluno extends Pessoa {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "matricula")
	private int matricula;
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "fk_professor") private Professor professor;
	 */

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/*
	 * public Professor getProfessor() { return professor; }
	 * 
	 * public void setProfessor(Professor professor) { this.professor =
	 * professor; }
	 */


}
