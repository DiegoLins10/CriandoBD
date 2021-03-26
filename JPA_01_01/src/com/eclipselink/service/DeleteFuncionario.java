package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class DeleteFuncionario {

	public void delete() {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		Funcionario funcionario = entitymanager.find(Funcionario.class, id);
		if (funcionario != null) {  
			entitymanager.remove(funcionario);
		} else {
			JOptionPane.showMessageDialog(null, "Funcionário não encontrado!!!");
		}

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}
