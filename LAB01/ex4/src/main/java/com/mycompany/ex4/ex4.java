package com.mycompany.ex4;


/****       @author uniffsuares             ****/

/*==============================================================================
-----------------PROGRAMA PARA CALCULAR REAJUSTE SALARIAL-----------------------
==============================================================================*/

// importando bibliotrecas que serão utilizadas no programa
import java.util.Scanner;


public class ex4 {
    public static void main(String[] args){
        
        /* criando objeto scan
           criando variaveis do programa
           salario = salario inicial do usuário
           reajuste = diferença entre salário inicial e salário final
           percentual = percentual do reajuste salarial */
        Scanner scan = new Scanner(System.in);
        float salario, reajuste = 0;
        String percentual = null;
        
        /* bloco de código para pegar o salario atual do usuário*/
        System.out.println("Digite o salario para reajuste: ");
        System.out.println("(Utilize virgula para separar casas decimais)");
        salario = scan.nextFloat();
        
        
        /* bloco de código que verifica qual procentagem será
           aplicada ao salário do usuário */
        if (salario <= 400){
            reajuste = (salario/100)*15;
            percentual = "15%";
        }
        
        else if (salario > 400 && salario <= 800){
            reajuste = (salario/100)*12;
            percentual = "12%";
        }
        
        else if (salario > 800 && salario <= 1200){
            reajuste = (salario/100)*10;
            percentual = "10%";
        }
        
        else if (salario > 1200 && salario <= 2000){
            reajuste = (salario/100)*7;
            percentual = "7%";
        }
        
        else if (salario > 2000){
            reajuste = (salario/100)*4;
            percentual = "4%";
        }
        else{
            System.out.println("Error, valor invalido.");
        }
        
        // mostrando para o usuario todos os valores
        System.out.printf("Novo salario: %.2f\n" , ((float)salario + (float)reajuste));
        System.out.printf("Reajuste: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual);
    }
}
