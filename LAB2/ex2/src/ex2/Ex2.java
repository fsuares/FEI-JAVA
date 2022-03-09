/*==============================================================================
--------------------PROGRAMA PARA CONTROLAR TELEVISAO---------------------------
==============================================================================*/
package ex2;
// importando bibliotecas utilizadas no programa

import java.util.Scanner;

// classe Main
public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();

        System.out.println("Qual o modelo da 1° talevisão? ");
        tv1.setModelo(scan.next());
        System.out.println("\nQual o preço da 1° televisão? ");
        tv1.setPreco(scan.nextFloat());
        System.out.println("\nQual o tamanho da 1° televisão? ");
        tv1.setTamanho(scan.nextFloat());

        System.out.println("\nQual o modelo da 2° talevisão? ");
        tv1.setModelo(scan.next());
        System.out.println("\nQual o preço da 2° televisão? ");
        tv1.setPreco(scan.nextFloat());
        System.out.println("\nQual o tamanho da 2° televisão? ");
        tv1.setTamanho(scan.nextFloat());

        while (true) {
            System.out.println("1 - Televisao 1\n2 - Televisao 2\n3 - Encerrar\n");
            int choiceTv = scan.nextInt();

            if (choiceTv == 1) {
                System.out.println("Modelo: " + tv1.getModelo());
                System.out.println("Preço: " + tv1.getPreco());
                System.out.println("Tamanho: " + tv1.getTamanho());
                System.out.println("Status: " + tv1.getLigada());
                if (tv1.getLigada() == "Ligada") {
                    System.out.println("Volume: " + tv1.getVolume());
                    System.out.println("Canal: " + tv1.getCanal());
                } else if (tv1.getLigada() == "Desligada") {
                    System.out.println("Ligar? \n(Sim/Não)");
                    String ligar = scan.next();
                    if (ligar == "Sim"){
                        tv1.desligaTv;
                    }
                    else{
                        break;
                    }
                }

                while (true) {
                    System.out.println("1 - Volume\n2 - Canal\n3 - Voltar\n");
                    int choice = scan.nextInt();

                    switch (choice) {

                        case 1:
                            while (true) {
                                System.out.println("\n<------VOLUME-MENU------>");
                                System.out.println("Aumentar -> (+)\nDiminuir -> (-)\n3 - Voltar -> (0)");
                                System.out.println("\n<----------------------->");
                                String moreless = scan.next();

                                if (moreless == "+" || moreless == "-") {
                                    System.out.println("\n===Volume" + tv1.alteraVolume(moreless) + "===");
                                } else if (moreless == "0") {
                                    break;
                                } else {
                                    System.out.println("Erro");
                                }
                            }

                        case 2:
                            while (true) {
                                System.out.println("\n<------CANAL-MENU------>");
                                System.out.println("Proximo -> (+)\n- Anterior -> (-)\nVoltar -> (0)");
                                System.out.println("\n<---------------------->");
                                String moreless = scan.next();

                                if (moreless == "+" || moreless == "-") {
                                    System.out.println("\n===Canal " + tv1.alteraCanal(moreless) + "===");
                                } else if (moreless == "0") {
                                    break;
                                } else {
                                    System.out.println("Erro");
                                }
                            }
                    }
                }
            }
        }
    }

}
