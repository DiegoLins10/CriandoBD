package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class CreateFuncionario {
	//Cria Objeto para funcionario
	static Funcionario funcionario = new Funcionario();

	public static void main(String[] args) {

		// Criando uma conex�o com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();     // inicio da transa��o

		entradaDados();

		entitymanager.persist(funcionario);         // gravar o funcion�rio
		entitymanager.getTransaction().commit();	// fim da transa��o

		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conex�o com o Banco de Dados

	}

	public static void entradaDados() {
		funcionario.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog("Id")));
		funcionario.setNome(JOptionPane.showInputDialog("Nome"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Sal�rio")));
		funcionario.setCargo(JOptionPane.showInputDialog("Cargo"));
	}

}
