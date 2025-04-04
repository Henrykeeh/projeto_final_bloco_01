package model;

public class PromocaoPercentual extends Promocao {
	private double percentualDesconto;

	public PromocaoPercentual(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto / 100.0;
	}

	@Override
	public double aplicarPromocao(double valor) {

		return valor * (1 - percentualDesconto);
	}

}
