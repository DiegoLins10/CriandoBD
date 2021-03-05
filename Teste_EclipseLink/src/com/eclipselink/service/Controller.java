package com.eclipselink.service;

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) {
		// Classes de Seviço
		CreateFuncionario crudInsert = new CreateFuncionario();
		DeleteFuncionario crudDelete = new DeleteFuncionario();
		FindFuncionario crudFind = new FindFuncionario();
		UpdateFuncionario crudUpdate = new UpdateFuncionario();
		
		String menu = "0 - Sair\n"
					+ "1 - Incluir\n"
					+ "2 - Pesquisar\n"
					+ "3 - Alterar\n"
					+ "4 - Excluir\n";
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
			}
		} while (opcao !=0);
	}
}