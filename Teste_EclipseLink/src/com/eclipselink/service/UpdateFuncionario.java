package com.eclipselink.service;
/*
 * @Author Diego Lins 26/02/2021
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class UpdateFuncionario {
	public static void main (String[] main) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpadb_01" );
  
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		 
		Funcionario funcionario = entitymanager.find( Funcionario.class, id );
		  
		//antes update
		JOptionPane.showMessageDialog(null, funcionario );
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
		funcionario.setSalario( salario );
		entitymanager.getTransaction( ).commit( );
		  
		//depois do update
		JOptionPane.showMessageDialog(null, funcionario );
		entitymanager.close();
		emfactory.close();		
	}
}
