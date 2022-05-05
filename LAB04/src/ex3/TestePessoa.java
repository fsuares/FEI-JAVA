package exericio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Pessoa> p = new ArrayList<>();
		
		while (true){
			System.out.println();
			System.out.println("Escolha uma opção: ");
			System.out.println("n [Nova entrada]");
			System.out.println("d [Apaga registro na agenda]");
			System.out.println("p [Imprime toda agenda]");
			System.out.println("q [Sai do programa]");
			
			String resp = input.next();
			
			System.out.println();
			
			if(resp.equals("n")){
				
				String nome,tel;
				
				System.out.println("Entre com o nome: ");
				nome = input.next();
				System.out.println("Entre com o telefone: ");
				tel = input.next();
				
				p.add(new Pessoa(nome,tel));
				
			}
			else if(resp.equals("d")) {
				String nome;
				System.out.println("Digite o nome que queira apagar da agenda: ");
				nome = input.next();
				
				for(int i=0; i<p.size(); i++) {

					if(p.get(i).getNome().equals(nome)) {
						p.remove(i);
					}
				}
				
				System.out.println(nome + " removido com sucesso!!");
				
			}
			
			else if(resp.equals("p")) {
				
				for(Pessoa pessoa : p) {
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Telefone: " + pessoa.getTelefone());
					System.out.println();
				}
			}
			
			else if(resp.equals("q")) {
				break;
			}
			else {
				System.out.println("Valor inválido, por gentileza digite novamente!");
			}
			
			
		}
	}

}
