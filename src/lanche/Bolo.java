package lanche;

public class Bolo extends Lanche{
	private String massa;
	private String recheio;
	private String cobertura;
	
	private String massas[] = {"P�o de l�", "Chocolate"};
	private String recheios[] = {"Morango", "Chocolate", "Coco", "Maracuj�", "Lim�o", "Doce de Leite", "Chocolate Branco"};
	private String coberturas[] = {"Morango", "Chocolate", "Caramelo", "Maracuj�", "Lim�o", "Doce de Leite", "Chocolate Branco"};

	/************************************ SUBMENU *****************************************/	
	@Override
	public void submenu() {
		preco = 7.5;
		System.out.println("-----MASSAS-----");
		for (int i = 0; i < massas.length; i++) {
			System.out.println((i+1) + ". "+ massas[i]);
		}
		opcao = in.nextInt();
		massa = massas[(opcao - 1)];
		
		System.out.println("-----RECHEIOS-----");
		for (int i = 0; i < recheios.length; i++) {
			System.out.println((i+1) + ". "+ recheios[i]);
		}
		opcao = in.nextInt();
		recheio = recheios[(opcao - 1)];
		
		System.out.println("-----COBERTURAS-----");
		for (int i = 0; i < coberturas.length; i++) {
			System.out.println((i+1) + ". "+ coberturas[i]);
		}
		opcao = in.nextInt();
		cobertura = coberturas[(opcao - 1)];
		confirmar();
	}
	
	public void confirmar() {
		System.out.println("");
		System.out.println("Seu pedido � um bolo com massa sabor "+massa+", recheio sabor "+recheio +" e cobertura sabor "+cobertura+ "?");
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
		preco += frete;
		tempo += 10; //preparo
		System.out.println("");
		System.out.println("O pedido vai custar R$"+preco);	
		System.out.println("A estimativa de entrega � "+tempo+" minutos.");
		System.out.println("");
		System.out.println("Obrigada pela compra!");
	}
	
	
}
