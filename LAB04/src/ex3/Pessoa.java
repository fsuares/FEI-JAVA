package exericio3;

/**
 * Classe Pessoa refernte ao exercicio3
 *
 * @author Victor Martins Gnidarxic
 */


public class Pessoa {
	private String nome;
	private String telefone;
	private static int id;
	
	
	
	public Pessoa(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
		this.id +=1;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
