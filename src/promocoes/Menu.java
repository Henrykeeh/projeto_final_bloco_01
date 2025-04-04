package promocoes;

import java.util.Scanner;
import controller.Carrinho;
import controller.IndiceInvalido;
import model.Produto;
import model.PromocaoEspecial;
import model.PromocaoPercentual;

public class Menu {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		boolean meuDesconto = true;
		boolean meuDescontoUsado = false;
		int opcao;

		Carrinho carrinhoCompras = new Carrinho();

		Produto monitor = new Produto("Monitor 4k WideScreen", 2000);
		Produto teclado = new Produto("Teclado Mecânico RGB", 200);
		Produto mouse = new Produto("Mouse ultra leve RGB 2000 DPI", 250);
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

				System.out.println("\nO valor do produto " + monitor.getNome() + " é R$" + monitor.getValorBruto());

				double valorDesconto = new PromocaoPercentual(30).aplicarPromocao(monitor.getValorBruto());

				monitor.setValorLiquido(valorDesconto);

				System.out.println("\nPreço com desconto: " + valorDesconto);

				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {

					carrinhoCompras.adicionar(monitor);

					System.out.println("\nProduto adicionado com sucesso!");

				}

				System.out.println("\nVoltando ao Menu Principal...");

			}

			case 2 -> {

				String aceite;

				System.out.println("\nO valor do produto " + teclado.getNome() + " é R$" + teclado.getValorBruto());

				double valorDesconto = new PromocaoPercentual(35).aplicarPromocao(teclado.getValorBruto());

				teclado.setValorLiquido(valorDesconto);

				System.out.println("\nPreço com desconto: " + valorDesconto);

				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {

					carrinhoCompras.adicionar(teclado);

					System.out.println("\nProduto adicionado com sucesso!");

				}

				System.out.println("\nVoltando ao Menu Principal...");
			}

			case 3 -> {

				String aceite;

				System.out.println("\nO valor do produto " + mouse.getNome() + " é R$" + mouse.getValorBruto());

				double valorDesconto = new PromocaoPercentual(50).aplicarPromocao(mouse.getValorBruto());

				mouse.setValorLiquido(valorDesconto);

				System.out.println("\nPreço com desconto: " + valorDesconto);

				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {

					carrinhoCompras.adicionar(mouse);

					System.out.println("\nProduto adicionado com sucesso!");

				}

				System.out.println("\nVoltando ao Menu Principal...");
			}

			case 4 -> {

				String aceite;

				System.out
						.println("\nO valor do produto " + memoriaRAM.getNome() + " é R$" + memoriaRAM.getValorBruto());

				double valorDesconto = new PromocaoPercentual(40).aplicarPromocao(memoriaRAM.getValorBruto());

				memoriaRAM.setValorLiquido(valorDesconto);

				System.out.println("\nPreço com desconto: " + valorDesconto);

				System.out.println("Deseja adicionar ao Carrinho? (Sim/Não)");

				lerScanner.skip("\\R?");
				aceite = lerScanner.nextLine();

				if (aceite.equalsIgnoreCase("sim")) {

					carrinhoCompras.adicionar(memoriaRAM);

					System.out.println("\nProduto adicionado com sucesso!");

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

							System.out.println("\nO valor do produto " + cpu.getNome() + " é R$" + cpu.getValorBruto());

							double valorDesconto = new PromocaoEspecial(60).aplicarPromocao(cpu.getValorBruto());

							cpu.setValorLiquido(valorDesconto);

							System.out.println("\nPreço com desconto: " + valorDesconto);

							System.out.println("\nDeseja adicionar ao Carrinho? (Sim/Não)");

							lerScanner.skip("\\R?");
							aceite = lerScanner.nextLine();

							if (aceite.equalsIgnoreCase("sim")) {

								meuDesconto = false;
								meuDescontoUsado = true;

								carrinhoCompras.adicionar(cpu);

								System.out.println("\nProduto adicionado com sucesso!");

							}

							System.out.println("\nVoltando ao Menu Principal...");

						}

						case 2 -> {

							String aceite;

							System.out.println("\nO valor do produto " + placaVideo.getNome() + " é R$"
									+ placaVideo.getValorBruto());

							double valorDesconto = new PromocaoEspecial(60).aplicarPromocao(placaVideo.getValorBruto());

							placaVideo.setValorLiquido(valorDesconto);

							System.out.println("\nPreço com desconto: " + valorDesconto);

							System.out.println("\nDeseja adicionar ao Carrinho? (Sim/Não)");

							lerScanner.skip("\\R?");
							aceite = lerScanner.nextLine();

							if (aceite.equalsIgnoreCase("sim")) {

								meuDesconto = false;
								meuDescontoUsado = true;

								carrinhoCompras.adicionar(placaVideo);

								System.out.println("\nProduto adicionado com sucesso!");

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

							meuDesconto = false;
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
				System.out.println("*************************************************");
				System.out.println("                Meu Carrinho                     ");
				System.out.println("*************************************************");
				System.out.println("Meus Produtos:                                   ");

				carrinhoCompras.listarProdutosValores();

				carrinhoCompras.somarValoresBrutos();

				carrinhoCompras.somarValoresLiquidos();

				int opcaoCarrinho;
				boolean carrinhoAtivo = true;

				while (carrinhoAtivo == true) {
					System.out.println("\nDigite 1 para Comprar");
					System.out.println("\nDigite 2 para retirar um item do carrinho");
					System.out.println("\nDigite 3 para Sair");

					opcaoCarrinho = lerScanner.nextInt();

					switch (opcaoCarrinho) {

					case 1 -> {
						System.out.println("Compra efetuada com sucesso! Aproveite!");
						return;
					}

					case 2 -> {
						System.out.println("Qual item deseja retirar? ");

						carrinhoCompras.listarProdutosValores();

						int opcaoRemover;

						opcaoRemover = lerScanner.nextInt();

						try {
							carrinhoCompras.deletar(opcaoRemover);
						} catch (IndiceInvalido e) {
							System.err.println("Exceção: " + e);
							System.out.println("\nVoltando ao Menu Principal...");
							carrinhoAtivo = false;

						}
					}

					case 3 -> {
						carrinhoAtivo = false;
						break;
					}

					default -> {
						System.out.println("Opção inválida!");

					}
					}
				}
			}

			}
		}

	}

}
