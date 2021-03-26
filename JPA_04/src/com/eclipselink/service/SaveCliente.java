package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.PessoaFisica;
import com.eclipselink.entity.PessoaJuridica;

public class SaveCliente {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_04");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

// Pessoa Fisíca
		PessoaFisica pf01 = new PessoaFisica(1, "Antonio", "Rua das Couves, 123 - Centro", "11 988880976",
				"antonio@email.com", "2158858-1", "123420312-12", "M");

		PessoaFisica pf02 = new PessoaFisica(2, "Maria", "Rua das Bromélias, 500 - Centro", "11 977770981",
				"maria@email.com", "2121411-1", "123456987-34", "F");

// Pessoa Jurídica
		PessoaJuridica pj01 = new PessoaJuridica(3, "Xpto", "Av. Das Nações, 434", "xpto@email.com", "11 55558888",
				"000212121-98", "57575677-54", "0202018/0001-12", "Xpto Ltda");

// Pessoa Jurídica
		PessoaJuridica pj02 = new PessoaJuridica(4, "ABC System", "Av. Riachuelo, 1001", "abcsystem@email.com",
				"11 444341221", "00292861-31", "66666574-97", "001213423/0001-54", "Abc System S/A");

		// gravando os dados
		entitymanager.persist(pf01);
		entitymanager.persist(pf02);
		entitymanager.persist(pj01);
		entitymanager.persist(pj02);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}
