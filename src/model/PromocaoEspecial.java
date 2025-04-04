package model;

import java.time.LocalDate;

public class PromocaoEspecial extends Promocao {

	private double percentualDesconto;

	public PromocaoEspecial(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto / 100.0;
	}

	@Override
	public double aplicarPromocao(double valor) {
		LocalDate dataAtual = LocalDate.now();

		if (dataAtual.getMonthValue() == dataAtual.getDayOfMonth()) {
			return valor * (1 - percentualDesconto - 0.2);
		}

		return valor * (1 - percentualDesconto);
	}

}
