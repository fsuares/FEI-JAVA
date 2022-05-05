package com.mycompany.ex5;

/*==============================================================================
-----------------PROGRAMA PARA IMPRIMIR ASTERISCOS ADJACENTES-------------------
==============================================================================*/
// importando bibliotecas que serao utilizadas no programa
import java.util.Scanner;

/**
 * ** @author uniffsuares **
 */

// classe Main
public class ex5 {

    // metodo main
    public static void main(String[] args) {

        // instanciando objeto scan
        Scanner scan = new Scanner(System.in);

        // pegando os valores a serem impressos com o usuario
        System.out.println("Digite os numeros entre 1 e 30 a serem impressos: ");
        System.out.println("(Separe os numeros por espaços)");
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(), n4 = scan.nextInt(), n5 = scan.nextInt();

        // condição para limitar o programa
        /* caso o usuário precise utilizar valores maiores
           a condição pode ser removida                 */
        if ((n1 < 1 || n1 > 30) || (n2 < 1 || n2 > 30) || (n3 < 1 || n3 > 30) || (n4 < 1 || n4 > 30) || (n5 < 1 || n5 > 30)) {
            System.out.println("Por favor digite valores válidos. (1 a 30)");  
        }
        
        else{
            // bloco de código de laços para a criação das linhas
            for (int i = 0; i < n1; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < n2; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < n3; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < n4; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            for (int i = 0; i < n5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
