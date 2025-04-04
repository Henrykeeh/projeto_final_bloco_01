package controller;

import java.util.ArrayList;

import model.Produto;
import repository.CompraRepository;

public class Carrinho implements CompraRepository {

	ArrayList<Produto> carrinho = new ArrayList<>();

	@Override
	public void listarProdutosValores() {

		for (int i = 0; i < carrinho.size(); i++) {
			Produto produto = carrinho.get(i);
			System.out.println("\n"+ (i+1) + " " + produto.getNome() + " R$" + produto.getValorBruto());
		}

	}

	@Override
	public void somarValoresBrutos() {
		double somaBruta = carrinho.stream().mapToDouble(Produto::getValorBruto).sum();
		System.out.println("Total Bruto: R$" + somaBruta);
	}
	
	@Override
	public void somarValoresLiquidos() {
		double somaLiquida = carrinho.stream().mapToDouble(Produto::getValorLiquido).sum();
		System.out.println("Total Líquido: R$" + somaLiquida);
	}
	
	@Override
	public void deletar(int indice) {
		
		if (carrinho.isEmpty()) {
			throw new IndiceInvalido("Carrinho vazio!");
		}
		
		if (indice > carrinho.size() + 1){
			throw new IndiceInvalido("Item selecionado inválido");
		}
		
		carrinho.remove(indice - 1);
		System.out.println("Produto removido com sucesso!");
	
	}

	@Override
	public void adicionar(Produto produto) {
		carrinho.add(produto);
	}

}
