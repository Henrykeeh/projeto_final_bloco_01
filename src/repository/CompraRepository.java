package repository;

import model.Produto;

public interface CompraRepository {

	public void listarProdutosValores();

	public void deletar(int indice);

	public void adicionar(Produto produto);
	
	public void somarValoresBrutos();
	
	public void somarValoresLiquidos();
	
	
}
