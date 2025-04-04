package model;

public class Produto {

	private String nome;
	private double valorBruto;
	private double valorLiquido;


	public Produto(String nome, double valorBruto) {
		super();
		this.nome = nome;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorBruto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorBruto() {
		return valorBruto;
	}


	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}


	public double getValorLiquido() {
		return valorLiquido;
	}


	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	
}
