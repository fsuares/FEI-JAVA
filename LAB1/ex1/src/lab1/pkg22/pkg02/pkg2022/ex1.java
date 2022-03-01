
/** **       @author uniffsuares        *** */

/*==============================================================================
----------------- PROGRAMA PARA IMPRIMIR UM QUADRADO COM * ---------------------
==============================================================================*/
// importando bibliotecas
import java.util.Scanner;

public class ex1 {

    // metodo main
    public static void main(String[] args) {

        // instanciando a classe Scanner
        Scanner scan = new Scanner(System.in);

        // pegando o valor dos lados do quadrado
        System.out.print("Digite o tamanho do lado do quadrado: ");
        int lado = scan.nextInt();

        // declarando variaveis
        int n, i, j = 1;

        // condição que limita o programa
        // caso seja necessário, pode ser alterada 
        if (lado > 20 || lado < 1) {
            System.out.println("Favor digitar um valor válido. (1 a 20)");
        }
        else{
            // loop para imprimir o quadrado
            for (i = 1; i <= lado; i++) {

                // condição para imprimir 1º e ultima linhas
                if (i == 1 || i == lado) {

                    // laço para imprimir * da 1º e ultima linha
                    while (j <= lado) {
                        System.out.print("*");
                        j++;
                    }
                    j = 1;
                    System.out.println();
                } // condição para imprimir linhas restantes 
                else if (i > 1 && i < lado) {

                    // laço para imprimir linhas
                    for (n = 1; n <= lado; n++) {

                        // condição que verifica se é o 1º ou ultimo caractere da linha
                        if (n == 1 || n == lado) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
