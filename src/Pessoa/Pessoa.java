package Pessoa;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	//Construtor padrão
	public Pessoa() {
		
	}
	
	//Opções de construtores
	
	public Pessoa(String nome, String endereco) {
		this.setNome(nome);
		this.setEndereco(endereco);
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String toString() {
		return ("\nNome: "+this.getNome()+
				"\nEndereço: "+this.getEndereco()+
				"\nTelefone: "+this.getTelefone());
	}

}
