package com.eclipselink.service;
/*
 * @Author Diego Lins 05/03/2021
 */

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) {
		// Classes de Seviço
		CreateFuncionario crudInsert = new CreateFuncionario();
		DeleteFuncionario crudDelete = new DeleteFuncionario();
		FindFuncionario crudFind = new FindFuncionario();
		UpdateFuncionario crudUpdate = new UpdateFuncionario();
		ConsultasJPQLFuncionario crudConsu = new ConsultasJPQLFuncionario();
		
		String menu = "0 - Sair\n"
					+ "1 - Incluir\n"
					+ "2 - Pesquisar\n"
					+ "3 - Alterar\n"
					+ "4 - Excluir\n"
					+ "5 - Ver Banco/Informações adicionais\n";
		int opcao = 0;
		
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				crudInsert.insert();
				break;
			case 2:
				crudFind.find();
				break;
			case 3:
				crudUpdate.update();
				break;
			case 4:
				crudDelete.delete();
				break;
			case 5:
				crudConsu.consultar();
				break;	
			}
		} while (opcao !=0);
	}
}