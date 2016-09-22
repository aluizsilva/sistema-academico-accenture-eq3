package com.accenture.academico.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*@Entity
@Inheritance(strategy = InheritanceType.JOINED)*/
@MappedSuperclass
public class Pessoa {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome")
	private String nome;
	@Column(name = "cpf")
	private String cpf;
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "fk_endereco") private Endereco endereco;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "fk_telefone") private Telefone fone;
	 */
	@Column
	private String sexo;
	@Column
	private String tipoPessoa;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "fk_titulo") private Endereco endereco;
	 */

	/*
	 * public Endereco getEndereco() { return endereco; }
	 * 
	 * public void setEndereco(Endereco endereco) { this.endereco = endereco; }
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/*
	 * public Endereco getEndereco() { return endereco; }
	 * 
	 * public void setEndereco(Endereco endereco) { this.endereco = endereco; }
	 */

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/*
	 * public Telefone getFone() { return fone; }
	 * 
	 * public void setFone(Telefone fone) { this.fone = fone; }
	 */

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
