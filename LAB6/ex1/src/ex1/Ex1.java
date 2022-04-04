

package ex1;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado, base, altura;
        int opcao = 0;
        
        while (opcao != 3){
            System.out.println("-------------------MENU--------------------");
            System.out.println("---------------1 - Quadrado----------------");
            System.out.println("---------------2 - Retangulo---------------");
            System.out.println("-------------------------------------------\n");
            opcao = scan.nextInt();
            
            switch (opcao){
                case 1 : 
                    System.out.println("Digite o valor do lado do quadrado: ");
                    lado = scan.nextInt();
                    Area a1 = new Area(lado);
                    break;
                case 2 : 
                    System.out.println("Digite base do retangulo: ");
                    base = scan.nextInt();
                    System.out.println("Digite altura do retangulo: ");
                    altura = scan.nextInt();
                    Area a2 = new Area(base, altura);
                    break;
            }
        }
        
    }
    
}
