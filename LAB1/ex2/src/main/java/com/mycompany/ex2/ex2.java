package com.mycompany.ex2;

/****       @author uniffsuares             ****/

/*==============================================================================
-----PROGRAMA PARA CALCULAR A SOMA DE DETERMINADOS PRODUTOS DE UMA EMPRESA------
------------------------PRODUTOS ESCOLHIDOS POR CLIENTES------------------------
==============================================================================*/

// importando bibliotecas para o programa
import java.util.Scanner;

public class ex2 {

    // metodo main da classe Main
    public static void main(String[] args) {
        
        // criando meu objeto scanner
        Scanner scan = new Scanner(System.in);

        // criando meus objetos da classe produto
        // definindo valor para cada objeto
        
        // produto 1
        Produto prod1 = new Produto();
        prod1.setValor((float) 2.98);
        // produto 2
        Produto prod2 = new Produto();
        prod2.setValor((float) 4.50);
        // produto 3
        Produto prod3 = new Produto();
        prod3.setValor((float) 3.98);
        // produto 4
        Produto prod4 = new Produto();
        prod4.setValor((float) 4.49);
        // produto 5
        Produto prod5 = new Produto();
        prod5.setValor((float) 6.87);

        // criando variaveis do programa
        // quant = quantidade a ser adicionada
        // sentinel = variavel de controle do laço
        int quant, sentinel = 0;
        // valor_final = valor final dos produtos somados
        float valor_final = 0;
        

        // loop controlado por sentinela
        while (sentinel != 6) {
            
            // ---------------------MENU------------------------
            System.out.println("Opções: ");
            System.out.println("1 - Adicionar produto 1");
            System.out.println("2 - Adicionar produto 2");
            System.out.println("3 - Adicionar produto 3");
            System.out.println("4 - Adicionar produto 4");
            System.out.println("5 - Adicionar produto 5");
            System.out.println("6 - Ver o valor final e encerrar o programa");
            sentinel = scan.nextInt();

            
            // verificação de escolha do usuario
            switch (sentinel) {
                
                // condição de soma do produto 1
                case 1:
                    System.out.println();
                    System.out.println("Quantidade a ser adicionada: ");
                    quant = scan.nextInt();
                    valor_final = valor_final + (prod1.somaValor(prod1.getValor(), quant));
                    System.out.println();
                    break;
                
                // condição de soma do produto 2
                case 2:
                    System.out.println();
                    System.out.println("Quantidade a ser adicionada: ");
                    quant = scan.nextInt();
                    valor_final = valor_final + (prod2.somaValor(prod2.getValor(), quant));
                    System.out.println();
                    break;
                    
                // condição de soma do produto 3
                case 3:
                    System.out.println();
                    System.out.println("Quantidade a ser adicionada: ");
                    quant = scan.nextInt();
                    valor_final = valor_final + (prod3.somaValor(prod3.getValor(), quant));
                    System.out.println();
                    break;
                    
                // condição de soma do produto 4
                case 4:
                    System.out.println();
                    System.out.println("Quantidade a ser adicionada: ");
                    quant = scan.nextInt();
                    valor_final = valor_final + (prod4.somaValor(prod4.getValor(), quant));
                    System.out.println();
                    break;
                
                // condição de soma do produto 5
                case 5:
                    System.out.println("Quantidade a ser adicionada: ");
                    quant = scan.nextInt();
                    valor_final = valor_final + (prod5.somaValor(prod5.getValor(), quant));
                    System.out.println();
                    break;
                
                // condição de quebra do laço
                case 6:
                    System.out.println();
                    System.out.println("O valor final é de R$" + valor_final + ".");
                    break;
            }
        }
    }
}
