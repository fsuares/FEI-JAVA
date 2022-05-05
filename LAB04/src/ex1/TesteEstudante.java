package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList <Estudante> est = new ArrayList<>();
		
		est.add(new Estudante("Joao","Victor","01"));

		for(int i=0; i<30; i++){
			System.out.println("Digite o nome: ");
			String temp1 = input.next();
			System.out.println("Digite o sobrenome: ");
			String temp2 = input.next();
			System.out.println("Digite o identificador: ");
			String temp3 = input.next();
			est.add(new Estudante(temp1,temp2,temp3));
		}
		
		
		System.out.println();
		
		for (Estudante estudante: est) {
			System.out.println("Nome: " + estudante.getNome() + " " + estudante.getSobrenome());
			System.out.println("Identificador: " + estudante.getIdentificador());
			System.out.println();
		}
	
		
		System.out.println(est.get(2).getProximold());
		System.out.println(est.get(0).getProximold());
	}

}
