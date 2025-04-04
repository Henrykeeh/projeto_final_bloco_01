package promocoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		boolean meuDesconto = true;
		boolean meuDescontoUsado = false;
		float valor;
		int opcao;
		String produtos[] = { "Monitor WideScreen 4k", "CPU 3nm octa core", "Memória RAM DDR9 32 GB",
				"Caixa de Som 3D sound", "Mouse RGB 500 DPI", "Teclado Mecânico RGB" };

		while (true) {

			System.out.println("*******************************************************");
			System.out.println("              Eletrifik - Turbine sua energia!         ");
			System.out.println("              Bem vinde a Aba de Promoções             ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("       1 - " + produtos[0] + " - 30% off               ");
			System.out.println("       2 - " + produtos[1] + " - 35% off               ");
			System.out.println("       3 - " + produtos[2] + " - 50% off               ");
			System.out.println("       4 - " + produtos[3] + " - 50% off               ");
			System.out.println("       5 - Meu Desconto - Descontos especiais para mim!");
			System.out.println("       6 - Ver Carrinho                                ");
			System.out.println("       7 - Sair                                        ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("              Entre com a opção desejada:              ");

			opcao = lerScanner.nextInt();

			if (opcao == 7) {
				System.out.println("\nVolte Sempre! \nEletrifik - Turbine sua energia!");

				lerScanner.close();
				System.exit(0);
			}

			switch (opcao) {
			// Será atualizado com classes e métodos posteriormente.
			case 1 -> {
				System.out.println("\nO valor do produto ");
			}

			case 2 -> {
				System.out.println("\nO valor do produto ");
			}

			case 3 -> {
				System.out.println("\nO valor do produto ");
			}

			case 4 -> {
				System.out.println("\nO valor do produto ");
			}

			case 5 -> {

				int opcaoMeuDesconto;
				
				if (meuDescontoUsado == false) {
					
				do {

					System.out.println("\nEscolha apenas um produto da lista especial para adicioná-lo ao carrinho: ");
					System.out.println("       1 -                                                ");
					System.out.println("       2 -                                                ");
					System.out.println("       3 - Sair                                           ");

					opcaoMeuDesconto = lerScanner.nextInt();

					switch (opcaoMeuDesconto) {

					case 1 -> {
						System.out.println("\nO valor do produto ");
						// método para adicionar ao carrinho
						
						meuDesconto = false;
						meuDescontoUsado = true;
					}

					case 2 -> {
						System.out.println("\nO valor do produto ");
						// método para adicionar ao carrinho
						
						meuDesconto = false;
						meuDescontoUsado = true;
					}

					case 3 -> {
						System.out.println("\nVoltando ao Menu Principal...");

						meuDesconto = false;
						meuDescontoUsado = false;
						
						break;
					}

					default -> {
						System.out.println("\nOpção inválida!");
						
						meuDescontoUsado = false;
					}

					}
				
				} while (meuDesconto == true);
				
				}
				
				else {
					System.out.println("A opção Meu Desconto já foi utilizada!");
				}
			}

			case 6 -> {
				System.out.println("Meu carrinho: ");
				// método para adicionar ao carrinho
				// método para ver valor total e itens unitários
			}

			default -> {
				System.out.println("Opção inválida!");
			}
			}
		}

	}

}
