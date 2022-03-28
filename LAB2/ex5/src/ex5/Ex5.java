/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        PerfilDeSaude pessoa1 = new PerfilDeSaude();
       
        System.out.print("Nome: ");
        pessoa1.setNome(scan.next());
        System.out.print("Sobrenome: ");
        pessoa1.setNome(scan.next());
        System.out.print("Sexo: ");
        pessoa1.setNome(scan.next());
        System.out.println("---Data de nascimento---");
        System.out.print("Dia: ");
        pessoa1.setDia(scan.nextInt());
        System.out.print("Mês: ");
        pessoa1.setMes(scan.nextInt());
        System.out.print("Ano: ");
        pessoa1.setAno(scan.nextInt());
        System.out.print("\nPeso: ");
        pessoa1.setPeso(scan.nextDouble());
        System.out.print("Altura: ");
        pessoa1.setAltura(scan.nextDouble());
     
        System.out.println("Idade: " + pessoa1.getIdade() + "\nIMC: " + 
                            pessoa1.getImc()); 
   }
    
}
