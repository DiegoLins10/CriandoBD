package com.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departamento {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int idDepto;

	private String nomeDepto;

	public Departamento() {
		super();
	}

	public Departamento(int idDepto, String nomeDepto) {
		super();
		this.idDepto = idDepto;
		this.nomeDepto = nomeDepto;
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

	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", Nome Departamento=" + nomeDepto + "]";
	}
}