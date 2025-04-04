package promocoes;

import java.util.Scanner;

import model.Produto;
import model.PromocaoEspecial;
import model.PromocaoPercentual;

public class Menu {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		boolean meuDesconto = true;
		boolean meuDescontoUsado = false;
		int opcao;

		Produto monitor = new Produto("Monitor 4k WideScreen", 2000);
		Produto teclado = new Produto("Teclado Mecânico RGB", 200);
		Produto mouse = new Produto("Mouse ulta leve RGB 2000 DPI", 250);
		Produto memoriaRAM = new Produto("Memoria RAM 16GB DDR6", 300);
		Produto cpu = new Produto("CPU 3nm Octa Core", 1000);
		Produto placaVideo = new Produto("Placa de Vídeo 32GB vídeo RAM", 2300);

		while (true) {

			System.out.println("*******************************************************");
			System.out.println("              Eletrifik - Turbine sua energia!         ");
			System.out.println("              Bem vinde a Aba de Promoções             ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("       1 - " + monitor.getNome() + " - 30% off               ");
			System.out.println("       2 - " + teclado.getNome() + " - 35% off               ");
			System.out.println("       3 - " + mouse.getNome() + " - 50% off               ");
			System.out.println("       4 - " + memoriaRAM.getNome() + " - 40% off               ");
			System.out.println("       5 - Meu Desconto - Descontos especiais para você!");
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

			case 1 -> {

				String aceite;

				System.out.println("\nO valor do produto " + monitor.getNome() + " é R$" + monitor.getValor());
				System.out.println(
						"\nPreço com desconto: " + new PromocaoPercentual(30).aplicarPromocao(monitor.getValor()));
				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {
					// Aguardando criação da classe carrinho
				}

				System.out.println("\nVoltando ao Menu Principal...");

			}

			case 2 -> {

				String aceite;

				System.out.println("\nO valor do produto " + teclado.getNome() + " é R$" + teclado.getValor());
				System.out.println(
						"\nPreço com desconto: " + new PromocaoPercentual(35).aplicarPromocao(teclado.getValor()));
				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {
					// Aguardando criação da classe carrinho
				}

				System.out.println("\nVoltando ao Menu Principal...");
			}

			case 3 -> {

				String aceite;

				System.out.println("\nO valor do produto " + mouse.getNome() + " é R$" + mouse.getValor());
				System.out.println(
						"\nPreço com desconto: " + new PromocaoPercentual(50).aplicarPromocao(mouse.getValor()));
				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {
					// Aguardando criação da classe carrinho
				}

				System.out.println("\nVoltando ao Menu Principal...");
			}

			case 4 -> {

				String aceite;

				System.out.println("\nO valor do produto " + memoriaRAM.getNome() + " é R$" + memoriaRAM.getValor());
				System.out.println(
						"\nPreço com desconto: " + new PromocaoPercentual(40).aplicarPromocao(memoriaRAM.getValor()));
				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {
					// Aguardando criação da classe carrinho
				}

				System.out.println("\nVoltando ao Menu Principal...");
			}

			case 5 -> {

				int opcaoMeuDesconto;

				if (meuDescontoUsado == false) {

					do {

						System.out.println(
								"\nEscolha apenas um produto da lista especial para adicioná-lo ao carrinho: ");
						System.out.println(
								"\nTemos também um desconto especial de 20% para compras feitas em dia/mês equivalentes! (EX 04/04)");
						System.out.println("       1 - " + cpu.getNome() + " 60% off");
						System.out.println("       2 - " + placaVideo.getNome() + " 60% off");
						System.out.println("       3 - Sair                                           ");

						opcaoMeuDesconto = lerScanner.nextInt();

						switch (opcaoMeuDesconto) {

						case 1 -> {

							String aceite;

							System.out.println("\nO valor do produto " + cpu.getNome() + " é R$" + cpu.getValor());
							System.out.println("\nPreço com desconto: "
									+ new PromocaoEspecial(60).aplicarPromocao(cpu.getValor()));
							System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

							lerScanner.skip("\\R?");
							aceite = lerScanner.nextLine();

							if (aceite.equalsIgnoreCase("sim")) {
								
								meuDesconto = false;
								meuDescontoUsado = true;
								
								// Aguardando criação da classe carrinho
								// método para adicionar ao carrinho
							}

							System.out.println("\nVoltando ao Menu Principal...");

						}

						case 2 -> {
							
							String aceite;

							System.out.println("\nO valor do produto " + placaVideo.getNome() + " é R$" + placaVideo.getValor());
							System.out.println("\nPreço com desconto: "
									+ new PromocaoEspecial(60).aplicarPromocao(placaVideo.getValor()));
							System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

							lerScanner.skip("\\R?");
							aceite = lerScanner.nextLine();

							if (aceite.equalsIgnoreCase("sim")) {
								
								meuDesconto = false;
								meuDescontoUsado = true;
								
								// Aguardando criação da classe carrinho
								// método para adicionar ao carrinho
							}

							System.out.println("\nVoltando ao Menu Principal...");

						}

						case 3 -> {
							System.out.println("\nVoltando ao Menu Principal...");

							meuDesconto = false;
							meuDescontoUsado = false;

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
