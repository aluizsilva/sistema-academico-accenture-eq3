package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@ManagedBean(name="professor")
/*@PrimaryKeyJoinColumn(name = "id")*/
public class Professor extends Pessoa {
	
	@Column(name = "instituicaoEnsino")
	private String instituicaoEnsino;
	
	@Column(name = "dataAdmissao")
	private String dataAdmissao;
	
//	@JoinColumn(name = "fk_titulo")
//	private Titulo titulo;

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	// public Titulo getTitulo() {
	// return titulo;
	// }
	//
	// public void setTitulo(Titulo titulo) {
	// this.titulo = titulo;
	// }

}
