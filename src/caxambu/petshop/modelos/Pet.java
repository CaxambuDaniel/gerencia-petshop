package caxambu.petshop.modelos;

public class Pet {
	private String nome;
	private String raca;
	private int dataNascimento;

	
	
	public Pet(String nome, String raca, int dataNascimento) {
		
		this.nome = nome;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void mostra() {
		System.out.println(this.nome);
		System.out.println(this.raca);
		System.out.println(this.dataNascimento);

	}

}
