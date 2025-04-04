package repository;

import java.util.ArrayList;
import model.Produto;

public interface CompraRepository {

	public ArrayList<Produto> listarTodas();

	public void deletar(Produto produto);

	public void adicionar(Produto produto);
}
