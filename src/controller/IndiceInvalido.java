package controller;

public class IndiceInvalido extends RuntimeException{
	
	public IndiceInvalido (String mensagem) {
		super(mensagem);
	}
}
