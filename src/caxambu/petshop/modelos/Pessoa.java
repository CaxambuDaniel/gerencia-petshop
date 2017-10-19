package caxambu.petshop.modelos;

public class Pessoa {
	private String nome;
	private int telefoneCel;
	private int telefoneRes;
	private int cpf;
	private String email;
	public Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefoneCel() {
		return telefoneCel;
	}

	public void setTelefoneCel(int telefoneCel) {
		this.telefoneCel = telefoneCel;
	}

	public int getTelefoneRes() {
		return telefoneRes;
	}

	public void setTelefoneRes(int telefoneRes) {
		this.telefoneRes = telefoneRes;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostra() {
		System.out.println(this.nome);
		System.out.println(this.telefoneCel);
		System.out.println(this.telefoneRes);
		System.out.println(this.email);
		endereco.mostra();
		
	}

}
