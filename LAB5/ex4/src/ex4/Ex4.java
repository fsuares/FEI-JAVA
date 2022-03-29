/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Ex4 {

    public static void main(String[] args) {
        int menu = 3, forma = 6;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Iniciar\n"
                    + "2 - Encerra\n");
            menu = scan.nextInt();

            if (menu == 1) {
                while (forma != 5) {
                  
                    System.out.println("\nQual quadrilatero deseja calcular? ");
                    System.out.println("1 - Trapezio\n"
                                     + "2 - Paralelogramo\n"
                                     + "3 - Quadrado\n"
                                     + "4 - Retangulo\n"
                                     + "5 - Voltar\n");
                    forma = scan.nextInt();
                    
                    System.out.println("\nLembre P1 e P2 devem ter a mesma coord X");
                    System.out.println("\nDigite as coordenadas de P1: ");
                    System.out.println("(X e Y separados por espaco)");
                    Ponto p1 = new Ponto(scan.nextInt(), scan.nextInt());

                    System.out.println("\nDigite as coordenadas de P2: ");
                    System.out.println("(X e Y separados por espaco)");
                    Ponto p2 = new Ponto(scan.nextInt(), scan.nextInt());

                    System.out.println("\nLembre P3 e P4 devem ter a mesma coord Y");
                    System.out.println("\nDigite as coordenadas de P3: ");
                    System.out.println("(X e Y separados por espaco)");
                    Ponto p3 = new Ponto(scan.nextInt(), scan.nextInt());

                    System.out.println("\nDigite as coordenadas de P4: ");
                    System.out.println("(X e Y separados por espaco)");
                    Ponto p4 = new Ponto(scan.nextInt(), scan.nextInt());

                    
                    switch (forma) {
                        case 1:
                            System.out.println();
                            Trapezio trap = new Trapezio(p1, p2, p3, p4);
                            System.out.println("Base Maior: " + trap.lado2());
                            System.out.println("Base Menor: " + trap.lado1());
                            System.out.println("Altura: " + trap.altura());
                            System.out.println("Area: " + trap.area());
                            break;
                        case 2:
                            System.out.println();
                            Paralelogramo para = new Paralelogramo(p1, p2, p3, p4);
                            System.out.println("Base: " + para.lado2());
                            System.out.println("Altura: " + para.altura());
                            System.out.println("Area: " + para.area());
                            break;
                        case 3:
                            System.out.println();
                            Quadrado quad = new Quadrado(p1, p2, p3, p4);
                            System.out.println("Lado 1: " + quad.lado2());
                            System.out.println("Lado 2: " + quad.altura());
                            System.out.println("Area: " + quad.area());
                            break;
                        case 4:
                            System.out.println();
                            Retangulo ret = new Retangulo(p1, p2, p3, p4);
                            System.out.println("Lado 1: " + ret.lado2());
                            System.out.println("Lado 2: " + ret.altura());
                            System.out.println("Area: " + ret.area());
                            break;
                            
                    }

                }
                
            }
            else if (menu == 2){
                System.out.println("Encerrando...");
                break;
            }
            else {
                System.out.println("Erro...");
                System.out.println("Digite uma opcao valida...");
            }
        }
    }
}