package caxambu.petshop.modelos;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private int cep;
	private int numero;
	
	public Endereco(String rua, String bairro, String cidade, int cep, int numero) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.numero = numero;
	}

	
	public void mostra () {
		System.out.println(this.rua);
		System.out.println(this.bairro);
		System.out.println(this.cidade);
		System.out.println(this.cep);
		System.out.println(this.numero);
	}
	
	
	
}
