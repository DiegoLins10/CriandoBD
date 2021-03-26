package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.Departamento;
import com.eclipselink.entity.Funcionario;

public class OneToOne {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_09");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Cria departamentos
		Departamento depto01 = new Departamento(1, "TI");
		Departamento depto02 = new Departamento(2, "Estoque");

		// Grava departamentos
		entitymanager.persist(depto01);
		entitymanager.persist(depto02);

		// Cria funcionarios
		Funcionario func01 = new Funcionario(1, "José das Couves", 1027.54, "Gerente", depto01);
		Funcionario func02 = new Funcionario(2, "Maria Antonia", 14321.57, "Diretor", depto01);
		Funcionario func03 = new Funcionario(3, "Ana Cristina", 7219.98, "Desenvolvedor", depto01);
		Funcionario func04 = new Funcionario(4, "Rafaela Almeida", 1027.54, "Gerente", depto02);
		Funcionario func05 = new Funcionario(5, "Manuel Henrique", 14321.57, "Diretor", depto02);
		Funcionario func06 = new Funcionario(6, "Pedro Augusto", 7219.98, "Coordenador", depto02);

		// Grava funcionarios
		entitymanager.persist(func01);
		entitymanager.persist(func02);
		entitymanager.persist(func03);
		entitymanager.persist(func04);
		entitymanager.persist(func05);
		entitymanager.persist(func06);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}