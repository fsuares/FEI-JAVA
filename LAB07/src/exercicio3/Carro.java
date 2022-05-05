
package exercicio3;

public class Carro {
	private int velocidade;
	private int velocidadeMaxima;
	
	
	
	
	public Carro(int velocidade, int velocidadeMaxima) {
		this.velocidade = velocidade;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar(int valor){
		int temp = this.getVelocidade() + valor;
		
		if(temp > this.getVelocidadeMaxima()){
			throw new VelocidadeExcecao("Voc� n�o pode ultrapassar o limite de velocidade m�xima do carro!");
		}
		else{
			this.setVelocidade(temp);
		}
	}
	
	public void frear(int valor){
		int temp = this.getVelocidade() - valor;
		
		if(temp < 0){
			throw new VelocidadeExcecao("A velocidade n�o pode ser maior do que zero!!");
		}
		else{
			this.setVelocidade(temp);
		}
	}
	
}
