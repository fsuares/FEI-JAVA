
package com.mycompany.ex3;

/*   @author uniffsuares   */

//import java.util.Scanner;
import java.util.Random;


public class ex3 {
    public static void main(String[] args){
        
        // criando objeto de randomização de numeros
        Random rand = new Random();
        
        // randomizando os valores das portas P e R
        int pP = rand.nextInt(2), pR = rand.nextInt(2);
        
        // caso o usuario queira colocar manualmente os valores das portas
        // lembrar de tirar o comentario do import da classe Scanner e comentar a linha que randomiza as portas
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores (0 ou 1) para as portas P e R, simultaneamente separadas por um espaço: ");
        int pP = scan.nextInt(), pR = scan.nextInt();
        */
        
        
        // criando variaveis que verificam a condição da porta
        // e dos lados para qual as mesmas estão viradas
        String porta = null, ladoP = null, ladoR = null;
        
        // bloco de condição para descobrir qual caminho a bolinha vai cair
        if (pP == 0){
            porta = "C";
        }
        else if (pP == 1 && pR == 1){
            porta = "A";
        }
        else if (pP == 1 && pR == 0){
            porta = "B";
        }
        
        // bloco para verificar a direção da porta P
        switch (pP){
            case 1:
               ladoP = "direita.";
               break;
            case 0:
               ladoP = "esquerda.";
               break;
        }
        
        // bloco para verificar a direção da porta R        
        switch (pR){
            case 1:
               ladoR = "direita.";
               break;
            case 0:
               ladoR = "esquerda.";
               break;
        }
        
        // infromando o usuario para qual caminho a bolinha foie qual lado as portas estão viradas
        System.out.println("A porta P tem o valor " + pP + ", ou seja, esta virada para " + ladoP);
        System.out.println("A porta R tem o valor " + pR + ", ou seja, esta virada para " + ladoR);
        System.out.println("A bolinha caiu no caminho " + porta + ".");
    }
}
