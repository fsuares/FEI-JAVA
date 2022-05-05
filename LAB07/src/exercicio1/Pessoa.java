
package exercicio1;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	
	public Pessoa(String nome, String sobrenome, int idade, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if(cpf.contains(".") || cpf.contains("-")){
			throw new ExcecaoCpf("Erro ao digitar o cpf, digite sem caracteres especiais");
		}else{
			this.cpf = cpf;
		}
		this.idade = idade;
	}
	
	
	

}
