package lanche;

public class Sanduiche extends Lanche{
	private String recheios[] = new String [10];
	String pao;
	
	int contador = 0;
	int maisUm;
	
	private String paes [] = {"Integral", "Baguete", "Franc�s"};
	private String ingredientes[] = {"Presunto", "Queijo", "Carne", "Frango", "Mostarda", "Maionese", "Ketchup", 
			"Barbecue", "Alface", "Tomate", "Cebola", "Azeitona"}; 
	
	/************************************ SUBMENU *****************************************/		
	@Override
	public void submenu(){
		preco = 5;
		
		System.out.println("-----P�ES-----");
		for (int i = 0; i < paes.length; i++) {
			System.out.println((i+1) + ". "+ paes[i]);
		}
		opcao = in.nextInt();
		pao = paes[(opcao - 1)];
		
		System.out.println("-----INGREDIENTES-----");
		for (int i = 0; i < ingredientes.length; i++) {
			System.out.println((i+1) + ". "+ ingredientes[i]);
		}
		System.out.println("Acima de 3 recheios � cobrado 1 real por recheio. M�x: 10 recheios");
		System.out.println("");
		System.out.println("Qual igrediente voc� quer?");
		opcao = in.nextInt();
		recheios[0] = ingredientes[(opcao - 1)];

		System.out.println("Deseja adicionar mais um igrediente");
		System.out.println("1. SIM      2.N�O");
		maisUm = in.nextInt();
		
		 while (maisUm == 1) {
			 if (recheios[9] == null) {
			 	contador++;
				System.out.println("Qual igrediente voc� quer?");
				opcao = in.nextInt();
				recheios[contador] = ingredientes[(opcao - 1)];
				
				System.out.println("Deseja adicionar mais um igrediente");
				maisUm = in.nextInt();
			 } else {
				 System.out.println("Limite de igredientes excedido!");
				 maisUm = 2;
			 }
			}
		 confirmar();
	}
	
	@Override
	public void confirmar() {
		System.out.println("");
		System.out.println("Seu Sanduiche � de p�o "+pao+" e cont�m: ");
		
		for (int i = 0; i < recheios.length; i++) {
			if (recheios[i] != null) System.out.print("    " + recheios[i]);	
		}
		System.out.println("");
		System.out.println("Est� correto?");
		System.out.println("1.SIM       2.N�O");
		opcao = in.nextInt();
		
		if (opcao == 1) {
			System.out.println("Qual a dist�ncia do restaurante em km?");
			distancia(in.nextInt());
		} else {
			submenu();
		}
		
	}
	@Override
	public void preco() {
		
		if (contador > 2) { //mais de 3 igredientes cobra 1 reais por igrediente
			contador -= 2;
			preco += contador;
		}
		
		preco += frete;
		tempo += 15; //preparo
		System.out.println("");
		System.out.println("O pedido vai custar R$"+preco);	
		System.out.println("A estimativa de entrega � "+tempo+" minutos.");
		System.out.println("");
		System.out.println("Obrigada pela compra!");	
	}

}
