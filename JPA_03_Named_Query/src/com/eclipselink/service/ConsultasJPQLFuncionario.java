package com.eclipselink.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.eclipselink.entity.Funcionario;

public class ConsultasJPQLFuncionario {

	public static void main(String[] args) {
		// Conexão com a base
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_03");
		// Objeto para manipular classes/tabelas
		EntityManager entitymanager = emfactory.createEntityManager();

		// Funcionarios
		Query query1 = entitymanager.createQuery("Select e.nome, e.cargo, e.salario from Funcionario e");
		List<Object[]> list1 = query1.getResultList();
		
		// Mostrando os resultados
		System.out.println();
		for (Object[] e : list1) {
			System.out.println(e[0] + ", " + e[1] + ", " + e[2]);
		}
	
		// Utilizando Agregações
		Query query2 = entitymanager.createQuery("Select MAX(e.salario) from Funcionario e");
		Double result = (Double) query2.getSingleResult();

		Query query3 = entitymanager.createQuery("Select AVG(e.salario), SUM(e.salario) from Funcionario e");
		Object[] object = (Object[]) query3.getSingleResult();


		System.out.println("---------------------------------------");
		System.out.println("Maior Salário: " + result);
		System.out.println("Média Salário: " + object[0]);
		System.out.println("Soma Salário : " + object[1]);

		
		// Funcionarios / Where / Between / Like / Order
		Query query4 = entitymanager
				.createQuery("Select e from Funcionario e Where e.salario Between :salarioIni and :salarioFim "
						+ " and e.nome like '%m%'" + "Order by e.salario desc");

		query4.setParameter("salarioIni", 7000);
		query4.setParameter("salarioFim", 10000);
		List<Funcionario> funcionarios = (List<Funcionario>) query4.getResultList();

		System.out.println("\nFuncionarios / Where / Between / Like / Order");
		System.out.println("--------------------------------------------------");

		for (Funcionario func : funcionarios) {
			System.out.println(func.getIdFuncionario() + ", " + func.getNome() + ", " + func.getCargo() + ", "
					+ func.getSalario());
		}
		
		for(int i= 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i));
		}
		 
	}
}
