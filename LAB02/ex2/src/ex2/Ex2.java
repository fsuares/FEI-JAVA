

/*==============================================================================
--------------------PROGRAMA PARA CONTROLAR TELEVISAO---------------------------
==============================================================================*/
package ex2;
// importando bibliotecas utilizadas no programa

import java.util.Scanner;

// classe Main
public class Ex2 {

    public static void main(String[] args) {
        int choice = 9, choiceTv = 9;
        String ligar = "";
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
        tv2.setModelo(scan.next());
        System.out.println("\nQual o preço da 2° televisão? ");
        tv2.setPreco(scan.nextFloat());
        System.out.println("\nQual o tamanho da 2° televisão? ");
        tv2.setTamanho(scan.nextFloat());

        while (choiceTv != 3 || ligar == "Não" || ligar == "não" || ligar == "Nao" || ligar == "nao" || ligar == "n") {
            System.out.println("\n1 - Televisao 1\n2 - Televisao 2\n3 - Encerrar\n");
            choiceTv = scan.nextInt();

            // caso a escolha seja a primeira TV
            if (choiceTv == 1) {
                System.out.println();
                System.out.println("Modelo: " + tv1.getModelo());
                System.out.println("Preço: R$" + tv1.getPreco());
                System.out.println("Tamanho: " + (int) tv1.getTamanho() + "'");
                System.out.println("Status: " + tv1.getLigada());
                if (tv1.getLigada() == "Ligada") {
                    System.out.println("Volume: " + tv1.getVolume());
                    System.out.println("Canal: " + tv1.getCanal());
                } 
                else if (tv1.getLigada() == "Desligada") {
                    System.out.println("Ligar? (Sim/Não)");
                    ligar = scan.next();
                    if (ligar == "Sim" || ligar == "sim" || ligar == "s") {
                        tv1.setLigada(true);
                    } 
                    else {
                        System.out.println("Encerrando...");
                        break;
                    }
                }

                // se a tv estiver ligada o menu é mostrado
                while (choice != 3) {
                    System.out.println("\n1 - Volume\n2 - Canal\n3 - Voltar\n");
                    choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            while (true) {
                                System.out.println("\n<------VOLUME-MENU------>\n");
                                System.out.println("1 -> Aumentar\n2 -> Diminuir \n0 -> Voltar");
                                System.out.println("\n<----------------------->");
                                int moreless = scan.nextInt();

                                if (moreless == 1 || moreless == 2) {
                                    System.out.println("\n| Volume" + tv1.alteraVolume(moreless) + " |");
                                } 
                                else if (moreless == 0) {
                                    break;
                                } 
                                else if (moreless == 3) {
                                    int volume = scan.nextInt();
                                    tv1.setVolume(volume);
                                    System.out.println("\n| Volume: " + tv1.getVolume() + " |");
                                } 
                                else {
                                    System.out.println("Erro...");
                                }
                            }
                            break;

                        case 2:
                            while (true) {
                                System.out.println("\n<------CANAL-MENU------>\n");
                                System.out.println("1 -> Proximo \n2 -> Anterior \n3 -> Digitar canal desejado \n0 -> Voltar");
                                System.out.println("\n<---------------------->");
                                int moreless = scan.nextInt();

                                if (moreless == 1 || moreless == 2) {
                                    System.out.println("\n| Canal " + tv1.alteraCanal(moreless) + " |");
                                } 
                                else if (moreless == 0) {
                                    break;
                                } 
                                else if (moreless == 3) {
                                    int canal = scan.nextInt();
                                    tv1.setCanal(canal);
                                    System.out.println("\n| Canal: " + tv1.getCanal() + " |");
                                } 
                                else {
                                    System.out.println("Erro...");
                                }

                            }
                            break;

                        case 4:
                            tv1.setLigada(false);
                            break;
                    }
                }
            }

            // caso a escolhs seja a segunda TV
            if (choiceTv == 2) {
                System.out.println();
                System.out.println("Modelo: " + tv2.getModelo());
                System.out.println("Preço: R$" + tv2.getPreco());
                System.out.println("Tamanho: " + (int) tv2.getTamanho() + "'");
                System.out.println("Status: " + tv2.getLigada());
                if (tv2.getLigada() == "Ligada") {
                    System.out.println("Volume: " + tv2.getVolume());
                    System.out.println("Canal: " + tv2.getCanal());
                } 
                else if (tv2.getLigada() == "Desligada") {
                    System.out.println("Ligar? (Sim/Não)");
                    ligar = scan.next();

                    if (ligar == "Sim" || ligar == "sim" || ligar == "s") {
                        tv2.setLigada(true);
                    } 
                    else {
                        System.out.println("Encerrando...");
                        break;
                    }
                }

                // se a tv estiver ligada o menu é mostrado
                while (choice != 3) {
                    System.out.println("\n1 - Volume\n2 - Canal\n3 - Voltar\n4 - Desligar TV\n");
                    choice = scan.nextInt();

                    switch (choice) {

                        case 1:
                            while (true) {
                                System.out.println("\n<------VOLUME-MENU------>\n");
                                System.out.println("1 -> Aumentar \n2 -> Diminuir \n3 -> Digitar o volume desejado \n0 -> Voltar ");
                                System.out.println("\n<----------------------->");
                                int moreless = scan.nextInt();

                                if (moreless == 1 || moreless == 2) {
                                    System.out.println("\n| Volume:" + tv2.alteraVolume(moreless) + " |");
                                } 
                                else if (moreless == 0) {
                                    break;
                                } 
                                else if (moreless == 3) {
                                    int volume = scan.nextInt();
                                    tv2.setVolume(volume);
                                    System.out.println("\n| Volume: " + tv2.getVolume() + " |");
                                } 
                                else {
                                    System.out.println("Erro");
                                }
                            }
                            break;

                        case 2:
                            while (true) {
                                System.out.println("\n<------CANAL-MENU------>\n");
                                System.out.println("1 -> Proximo \n2 -> Anterior \n3 -> uDigitar o canal desejado \n0 -> Voltar ");
                                System.out.println("\n<---------------------->");
                                int moreless = scan.nextInt();

                                if (moreless == 1 || moreless == 2) {
                                    System.out.println("\n| Canal " + tv2.alteraCanal(moreless) + " |");
                                } 
                                else if (moreless == 0) {
                                    break;
                                } 
                                else if (moreless == 3) {
                                    int canal = scan.nextInt();
                                    tv2.setCanal(canal);
                                    System.out.println("\n| Canal: " + tv2.getCanal() + " |");
                                } 
                                else {
                                    System.out.println("Erro");
                                }
                            }
                            break;

                        case 4:
                            tv2.setLigada(false);
                            break;
                    }
                }
            }

            if (choiceTv == 3) {
                System.out.println("Encerrando...");
            }
        }
    }
}


