
package exercicio1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome, sobrenome, cpf;
		int idade;
		
		System.out.println("Digite sue nome: ");
		nome = input.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = input.next();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		System.out.println("Digite seu cpf: ");
		cpf = input.next();
		
		
		while(true){
		try{
			Pessoa p1 = new Pessoa(nome,sobrenome,idade,cpf);
		}
		catch(ExcecaoCpf e){
			System.out.println(e.getMessage());
			cpf = input.next();
			if(cpf.contains(".") || cpf.contains("-")){
				System.out.println("Cpf inv�lido, tente novamente!");
			}
			else{
				Pessoa p1 = new Pessoa(nome,sobrenome,idade,cpf);
				break;
			}	
		}
		
		}
		
		

	}

}
