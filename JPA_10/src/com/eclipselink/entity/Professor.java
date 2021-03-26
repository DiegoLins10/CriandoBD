package com.eclipselink.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Professor {
	@Id
	private int idProfessor;
	private String nomeProfessor;

	@ManyToMany(targetEntity = Disciplina.class)
	private Set disciplinaSet;

	public Professor() {
		super();
	}

	public Professor(int idProfessor, String nomeProfessor, Set disciplinaSet) {
		super();
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.disciplinaSet = disciplinaSet;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + "]";
	}
}