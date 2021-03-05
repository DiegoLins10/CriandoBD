package com.eclipselink.service;
/*
 * @Author Diego Lins 26/02/2021
 */


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class FindFuncionario {

	public void find() {
				
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_01" );
		EntityManager entitymanager = emfactory.createEntityManager();
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		Funcionario funcionario = entitymanager.find( Funcionario.class, id );
		
		JOptionPane.showMessageDialog(null, 
				  "idFuncionario = "+ funcionario.getIdFuncionario()
				+ "\nNome = " + funcionario.getNome()
				+ "\nSalário = " + funcionario.getSalario()
				+ "\nCargo = " + funcionario.getCargo()
		);
		
				
	}

}
