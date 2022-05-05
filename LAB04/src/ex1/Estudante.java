package exercicio1;


/**
 * Classe Estudante para o exercicio1
 *
 * @author Victor Martins Gnidarxic
 */

public class Estudante {
	private String nome;
	private String sobrenome;
	private String identificador;
	private static int proximold = 56;
	
	
	public Estudante( String nome, String sobrenome, String identificador){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.identificador = identificador;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public static int getProximold() {
		return proximold;
	}
	public static void setProximold(int proximold) {
		Estudante.proximold = proximold;
	}
	
	
	
	
}
