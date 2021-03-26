package com.eclipselink.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.Departamento;
import com.eclipselink.entity.Funcionario;

public class OneToMany {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_08");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		//Cria funcionarios
		List<Funcionario> funcionarios01 = new ArrayList();
		List<Funcionario> funcionarios02 = new ArrayList();

		funcionarios01.add(new Funcionario(1, "José das Couves", 1027.54, "Gerente"));
		funcionarios01.add(new Funcionario(2, "Maria Antonia", 14321.57, "Diretor"));
		funcionarios01.add(new Funcionario(3, "Ana Cristina", 7219.98, "Desenvolvedor"));
		funcionarios01.add(new Funcionario(4, "Antonio José", 6939.99, "Desenvolvedor"));
		funcionarios01.add(new Funcionario(5, "Pedro Almeida", 7219.98, "Desenvolvedor"));
		
		funcionarios02.add(new Funcionario(6, "Rafaela Almeida", 1027.54, "Gerente" ));
		funcionarios02.add(new Funcionario(7, "Manuel Henrique", 14321.57, "Diretor"));
		funcionarios02.add(new Funcionario(8, "Pedro Augusto", 7219.98, "Coordenador" ));

		//Grava funcionarios
		for (Funcionario funcionario: funcionarios01)
			entitymanager.persist(funcionario);
		
		for (Funcionario funcionario: funcionarios02)
			entitymanager.persist(funcionario);


		// Cria departamentos
		Departamento depto01 = new Departamento(1, "TI", funcionarios01);
		Departamento depto02 = new Departamento(2, "Estoque", funcionarios02);

		// Grava departamentos
		entitymanager.persist(depto01);
		entitymanager.persist(depto02);
		

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}