
package exercicio3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a velocidade do carro: ");
		int vel = input.nextInt();
		
		System.out.println("Digite a velocidade m�xima do carro: ");
		int velmax = input.nextInt();
		
		Carro c1 = new Carro(vel,velmax);
		
		while(true){
			int op;
			System.out.println("Velocidade atual: " + c1.getVelocidade());
			System.out.println();
			System.out.println("Escolha uma op��o: ");
			System.out.println("1 - Frear o carro");
			System.out.println("2 - Acelerar o carro");
			
			
			op = input.nextInt();
			
			if(op ==1){
				System.out.println("Escolha o quanto quer frear: ");
				try{
					c1.frear(input.nextInt());
				}catch(VelocidadeExcecao e){
					System.out.println(e.getMessage());
					break;
				}
			}
			
			else if(op ==2){
				System.out.println("Escolha o quanto quer acelerar: ");
				try{
					c1.acelerar(input.nextInt());
				}catch(VelocidadeExcecao e){
					System.out.println(e.getMessage());
					break;
				}
			}
			else
				System.out.println("Valor incorreto");
		}
		
		
		

	}

}
