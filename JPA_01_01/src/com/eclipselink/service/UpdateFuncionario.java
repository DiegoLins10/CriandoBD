package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class UpdateFuncionario {
	public void update () {
		// Criando uma conex�o com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_01" );
  
		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );   // Incio da transa��o
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		 
		Funcionario funcionario = entitymanager.find( Funcionario.class, id );
		if (funcionario != null) {  
			//antes update
			JOptionPane.showMessageDialog(null, funcionario );
			
			double salario = funcionario.getSalario();
			salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio", salario));
			funcionario.setSalario( salario );
		} else {
			JOptionPane.showMessageDialog(null, "Funcion�rio n�o encontrado!!!");
		}
		entitymanager.getTransaction( ).commit( );
		  
		//depois do update
		JOptionPane.showMessageDialog(null, funcionario );
		entitymanager.close();
		emfactory.close();		
	}
}