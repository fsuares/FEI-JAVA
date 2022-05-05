
package exercicio2;

import java.util.Scanner;

public class TestaLogin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String usuario;
		int senha;
		
		System.out.println("Digite seu usu�rio para cadastro: ");
		usuario = input.next();
		
		System.out.println("Digite sua senha para cadastro(somente n�meros inteiros):  ");
		senha = input.nextInt();
		
		Login admin = new Login(usuario,senha);
		
		System.out.println("Digite seu usu�rio para login: ");
		usuario = input.next();
		
		System.out.println("Digite sua senha para login:  ");
		senha = input.nextInt();
	
		
		try{
			admin.logar(usuario, senha);
		}
		catch(FalhaLogin e){
			System.out.println(e.getMessage());
		}
		

	}

}
