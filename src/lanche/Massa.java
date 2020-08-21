package lanche;

public class Massa extends Lanche{
	private String molho;
	private String massa;
	private String sabor;
	
	private String massas[] = {"Pizza", "Macarrão", "Lasanha"};
	private String molhos[] = {"Tomate", "Branco", "Queijo", "Bolonhesa"};
	private String sabores[] = {"Mussarela", "Calabresa", "Frango"};
	
/************************************ SUBMENU *****************************************/
	@Override
	public void submenu() {
		preco = 10;
		System.out.println("-----MASSAS-----");
		for (int i = 0; i < massas.length; i++) {
			System.out.println((i+1) + ". "+ massas[i]);
		}
		opcao = in.nextInt();
		massa = massas[(opcao - 1)];
		
		System.out.println("-----MOLHOS-----");
		for (int i = 0; i < molhos.length; i++) {
			System.out.println((i+1) + ". "+ molhos[i]);
		}
		opcao = in.nextInt();
		molho = molhos[(opcao - 1)];
		
		
		if (massa.equals("Pizza")) {
			System.out.println("-----RECHEIOS-----");
			for (int i = 0; i < sabores.length; i++) {
				System.out.println((i+1) + ". "+ sabores[i]);
			}
			opcao = in.nextInt();
			sabor = sabores[(opcao - 1)];
		}
		confirmar();
	}
		

	@Override
	public void confirmar() {
		System.out.println("");
		if (massa.equals("Pizza")) {
			System.out.println("Seu pedido é uma Pizza com molho "+molho+" no sabor " +sabor +"?");
			System.out.println("1.SIM       2.NÃO");
			opcao = in.nextInt();
		} else {
			System.out.println("Seu pedido é uma "+massa+" com molho "+molho+"?");
			System.out.println("1.SIM       2.NÃO");
			opcao = in.nextInt();
		}
		
		if (opcao == 1) {
			System.out.println("Qual a distância do restaurante em km?");
			distancia(in.nextInt());
		} else {
			submenu();
		}
	}
	
	@Override
	public void preco() {
		if (massa.equals("Pizza")) preco+=10; //pizza 20
		else if (massa.equals("Lasanha")) preco+=7; //lasanha 17
		
		preco += frete;
		tempo += 30; //preparo
		System.out.println("");
		System.out.println("O pedido vai custar R$"+preco);	
		System.out.println("A estimativa de entrega é "+tempo+" minutos.");
		System.out.println("");
		System.out.println("Obrigada pela compra!");
		
	}	
		
}
