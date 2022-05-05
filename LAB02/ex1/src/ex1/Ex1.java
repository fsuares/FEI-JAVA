

/*==============================================================================
-----------PROGRAMA PARA CALCULAR AREA E PERIMETRO DE UM RETANGULO--------------
==============================================================================*/


package ex1;

// importando bibliotecas utilizadas no programa
import java.util.Scanner;

// classe Main
public class Ex1 {
    public static void main(String[] args) {
        
        // instanciando objetos do programa
        Scanner scan = new Scanner(System.in);
        
        // construtor vazio
        Retangulo ret0 = new Retangulo();
        
        // instanciando objetos e 
        // pegando os valores com o usuario
        System.out.println("Insira base e altura do 1° retangulo (separados por espaço): ");
        Retangulo ret1 = new Retangulo(scan.nextInt(), scan.nextInt());
        
        System.out.println("Insira base e altura do 2° retangulo (separados por espaço): ");
        Retangulo ret2 = new Retangulo(scan.nextInt(), scan.nextInt());
        
        // imprimindo valores e resultados 1° retangulo
        System.out.println("<------1° Retangulo------>");
        System.out.println("Lado 1: " + ret1.getLado1() + "\nLado 2: " + ret1.getLado2() + "\n");
        System.out.println("Area: " + ret1.area() + "\nPerímetro: " + ret1.perimetro() + "\n");
        
        // imprimindo valores e resultados 2° retangulo
        System.out.println("<------2° Retangulo------>");
        System.out.println("Lado 1: " + ret2.getLado1() + "\nLado 2: " + ret2.getLado2() + "\n");
        System.out.println("Area: " + ret2.area() + "\nPerímetro: " + ret2.perimetro() + "\n");
    }
}


