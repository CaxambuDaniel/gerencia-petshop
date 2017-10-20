package caxambu.petshop.main;

import caxambu.petshop.modelos.Cliente;
import caxambu.petshop.modelos.Endereco;
import caxambu.petshop.modelos.Funcionario;
import caxambu.petshop.modelos.Pet;

public class TestaPessoaEPet {

	public static void main(String[] args) {
		
		Funcionario p1 = new Funcionario(); 
		p1.setNome("daniel");
		p1.setTelefoneCel(123);
		p1.setTelefoneRes(73485);
		p1.setEmail("asdasda@fasd.com");
		p1.endereco = new Endereco("Al. tocantins", "alphaville", "Barueri", 06653020, 822);
		
		
		
		Cliente p2 = new Cliente();
		p2.setNome("jao");
		p2.setTelefoneCel(123213);
		p2.setTelefoneRes(123234);
		p2.setEmail("sadaqr@sdf.com");
		p2.endereco = new Endereco("av ieie", "glu glu", "away ", 123421, 12452123);
		p2.pet = new Pet("bob"," castor",232628 );
		
		GerenciaCadastro armario = new GerenciaCadastro();
		armario.adiciona(p1);
		armario.adiciona(p2);
		
		Object p1NoArmario =(Funcionario) armario.pega(0);
		
		System.out.println(p2);
		
		
		
		
		
		
	}	
}
