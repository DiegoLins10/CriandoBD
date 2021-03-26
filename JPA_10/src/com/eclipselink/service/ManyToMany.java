package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.Disciplina;
import com.eclipselink.entity.Professor;
import java.util.HashSet;
import java.util.Set;

public class ManyToMany {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_10");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Cria Disciplina
		Disciplina dis01 = new Disciplina(1, "Matemática");
		Disciplina dis02 = new Disciplina(2, "Português");
		Disciplina dis03 = new Disciplina(3, "Historia");
		Disciplina dis04 = new Disciplina(4, "Geográfia");

		// Grava Disciplina
		entitymanager.persist(dis01);
		entitymanager.persist(dis02);
		entitymanager.persist(dis03);
		entitymanager.persist(dis04);

		// Cria Set1
		Set<Disciplina> disciplinaSet1 = new HashSet();
		disciplinaSet1.add(dis01);
		disciplinaSet1.add(dis02);
		disciplinaSet1.add(dis03);
		disciplinaSet1.add(dis04);
		
		//Cria Set2
		Set<Disciplina> disciplinaSet2 = new HashSet();
		disciplinaSet2.add(dis01);
		disciplinaSet2.add(dis03);

		//Cria Set3
		Set<Disciplina> disciplinaSet3 = new HashSet();
		disciplinaSet3.add(dis02);
		disciplinaSet3.add(dis04);

		//Cria Set4
		Set<Disciplina> disciplinaSet4 = new HashSet();
		disciplinaSet4.add(dis01);
		disciplinaSet4.add(dis04);

		//Cria Professor
		Professor prof01 = new Professor(1, "Joaquim Manuel", disciplinaSet1);
		Professor prof02 = new Professor(2, "Antonio Silva", disciplinaSet2);
		Professor prof03 = new Professor(3, "Ana Clara", disciplinaSet3);
		Professor prof04 = new Professor(4, "Maria Perez", disciplinaSet4);

		//Grava Professor
		entitymanager.persist(prof01);
		entitymanager.persist(prof02);
		entitymanager.persist(prof03);
		entitymanager.persist(prof04);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}