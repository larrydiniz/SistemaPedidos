package lanche;

import java.util.Scanner;

public class Principal {public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	int opcao;
	
	Lanche lanche;
/************************************ MENU *****************************************/	
	System.out.println("------MENU------");
	System.out.println("Você deseja:");
	System.out.println("1. Sanduiches");
	System.out.println("2. Massas");
	System.out.println("3. Bolos");
	
	opcao = in.nextInt();
	
	switch(opcao) {
	case 1:
		lanche = new Sanduiche();
		lanche.submenu();
		break;
	case 2:
		lanche = new Massa();
		lanche.submenu();
		break;
	case 3:
		lanche = new Bolo();
		lanche.submenu();
		break;
	default:
		System.out.println("Item não encontrado!");
		break;
	} 
	
	}
}