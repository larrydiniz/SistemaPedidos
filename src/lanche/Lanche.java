package lanche;

import java.util.Scanner;

public abstract class Lanche {
	int frete;
	double tempo;
	double preco;
	
	Scanner in = new Scanner(System.in);	
	int opcao;
	
	public abstract void submenu();
	
	public abstract void confirmar();	
	
	public void distancia(double km) {
		tempo = km*10;
		
		if (tempo > 39) { //a partir de 40min
			frete = 5;
		} else if (tempo > 19 && tempo < 39) { //acima de 20min
			frete = 2;
		} else {
			frete = 0;
		}
		preco();
	}		
	
	public abstract void preco();
	
	}
	
	
