package com.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class NamedQueries {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("find Funcionario id");

// Consulta por id
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		query.setParameter("id", id);
		List<Funcionario> funcionario = (List<Funcionario>) query.getResultList();

		if (funcionario != null) {
			for (Funcionario f : funcionario) {
				System.out.print("Employee ID :" + f.getIdFuncionario());
				System.out.println("\t Employee Name :" + f.getNome());
			}
		}

		// Consulta por nome
		Query query2 = entitymanager.createNamedQuery("find Funcionario nome");
		String nome = JOptionPane.showInputDialog("Nome");
		query2.setParameter("nome", nome);
		List<Funcionario> funcionario2 = (List<Funcionario>) query2.getResultList();

		if (funcionario2 != null) {
			for (Funcionario f : funcionario2) {
				System.out.print("Employee ID :" + f.getIdFuncionario());
				System.out.println("\t Employee Name :" + f.getNome());
			}
		}
		
		// Consulta por nome
		Query query3 = entitymanager.createNamedQuery("find Funcionario salario");
		Double sal1 = Double.valueOf(JOptionPane.showInputDialog("Salário Inicio"));
		Double sal2 = Double.valueOf(JOptionPane.showInputDialog("Salário Fim"));
		query3.setParameter("sal1", sal1);
		query3.setParameter("sal2", sal2);
		List<Funcionario> funcionario3 = (List<Funcionario>) query3.getResultList();

		if (funcionario3 != null) {
			for (Funcionario f : funcionario3) {
				System.out.println(f);
			}
		}
	}
}