package caxambu.petshop.main;

import caxambu.petshop.modelos.Endereco;
import caxambu.petshop.modelos.Pessoa;

public class TestaPessoaEPet {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(); 
		p1.setNome("daniel");
		p1.setTelefoneCel(123);
		p1.setTelefoneRes(73485);
		p1.setEmail("asdasda@fasd.com");
		p1.endereco = new Endereco("Al. tocantins", "alphaville", "Barueri", 06653020, 822);
		
		p1.mostra();
		
	}	
}
