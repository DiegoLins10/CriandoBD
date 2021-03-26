package com.eclipselink.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {

	@Id
	private int idDepto;

	private String nomeDepto;

	@OneToMany(targetEntity = Funcionario.class)
	private List funcionario;

	public Departamento() {
		super();
	}

	public Departamento(int idDepto, String nomeDepto, List funcionario) {
		super();
		this.idDepto = idDepto;
		this.nomeDepto = nomeDepto;
		this.funcionario = funcionario;
	}

	public int getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public String getNomeDepto() {
		return nomeDepto;
	}

	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	}

	public List getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", Nome Departamento=" + nomeDepto + "" + ", " + funcionario + " ]";
	}

}