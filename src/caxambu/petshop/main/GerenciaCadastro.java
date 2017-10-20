package caxambu.petshop.main;

public class GerenciaCadastro {
	
	private Object[] cadastro;
	private int posicaoLivre;
	
	
	
	public GerenciaCadastro() {
		cadastro = new Object[100] ;
		posicaoLivre = 0;
	}

	public void adiciona(Object novo) {
		
		cadastro[posicaoLivre] = novo;
		posicaoLivre++;
		
	}
	
	public Object pega(int posicao) {
		return cadastro[posicao];
	}
	
	
	
	
	
	
}
