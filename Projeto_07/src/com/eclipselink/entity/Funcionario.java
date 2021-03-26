package com.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario {

	@GeneratedValue(strategy = GenerationType.AUTO)

	@Id
	private int idFuncionario;
	private String nome;
	private double salario;
	private String cargo;

	@ManyToOne
	private Departamento departamento;

	public Funcionario(int id, String nome, double salario, String cargo, Departamento departamento) {
		super();
		this.idFuncionario = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + ","
				+ this.departamento.toString() + "]";
	}

}
