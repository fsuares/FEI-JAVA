
package ex3;
import java.util.Scanner;


/**
 *
 * @author fernando
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        // declarando variaveis
        int menu = 0, opcao = 0; // variaveis declaradas

        // instanciando scanner
        Scanner scan = new Scanner(System.in); // objeto scanner instanciado


        // menu para criar conta poupança e inserir seus atributos
        System.out.println("-------------------POUPANCA--------------------");
        System.out.println("Insira o saldo da conta e a taxa de juros: ");
        SavingsAccount contaPP = new SavingsAccount(scan.nextDouble(),
                                                    scan.nextDouble());
        System.out.println("-----------------------------------------------\n"); // fim do menu da conta poupança

        // menu para criar conta corrente e inserir seus atributos
        System.out.println("-------------------CORRENTE--------------------");
        System.out.println("Insira o saldo da conta e a taxa de cobranca: ");
        CheckingAccount contaCR = new CheckingAccount(scan.nextDouble(),
                                                      scan.nextDouble());
        System.out.println("-----------------------------------------------\n"); // fim do menu da conta corrente

        // loop para escolher a conta
        while (menu != 3){
            // menu de seleção de conta
            System.out.println("\n------ESCOLHA-A-CONTA------");
            System.out.println("1 - Conta Poupanca\n"
                             + "2 - Conta Corrente\n"
                             + "3 - Encerrar");
            System.out.println("-----------------------------"); // fim do menu de selecao de conta
            // scanner de seleção de conta
            menu = scan.nextInt();

            // bloco de condições para escolha de conta
            if (menu == 1){
                opcao = 0;
                while (opcao != 4){
                    // menu de opções conta poupança
                    System.out.println("\n------MENU-POUPANCA-----");
                    System.out.println("1 - Creditar\n"
                                     + "2 - Debitar\n"
                                     + "3 - Saldo\n"
                                     + "4 - Voltar");
                    System.out.println("------------------------"); // fim do menu conta poupança
                    // scanner de selecao de opção
                    opcao = scan.nextInt();

                    // condição de opção menu conta poupança
                    switch (opcao) {
                        case 1:
                            System.out.print("\nDigite o valor a ser creditado: ");
                            contaPP.credit(scan.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f\n", 
                                              contaPP.getBalance());
                            break;
                        case 2:
                            System.out.print("\nDigite o valor a ser debitado: ");
                            contaPP.debit(scan.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f\n", 
                                              contaPP.getBalance());
                            break;
                        case 3:
                            System.out.printf("\nSaldo: R$ %.2f\n", 
                                              contaPP.getBalance());
                            break;
                    } // fim do bloco de condições para o menu conta poupança
                }// fim do loop para a conta poupança
            } else if (menu == 2) {
                opcao = 0;
                // loop para menu da conta corrente
                while (opcao != 4){
                    // menu de opções conta corrente
                    System.out.println("\n------MENU-CORRENTE-----");
                    System.out.println("1 - Creditar\n"
                                     + "2 - Debitar\n"
                                     + "3 - Saldo\n"
                                     + "4 - Voltar");
                    System.out.println("------------------------"); // fim do menu conta corrente
                    // scanner de selecao de opcao
                    opcao = scan.nextInt();

                    // condição de opção menu conta corrente
                    switch (opcao) {
                        case 1:
                            System.out.print("\nDigite o valor a ser creditado: ");
                            contaCR.credit(scan.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f\n", 
                                            contaCR.getBalance());
                            break;
                        case 2:
                            System.out.print("\nDigite o valor a ser debitado: ");
                            contaCR.debit(scan.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f\n", 
                                            contaCR.getBalance());
                            break;
                        case 3:
                            System.out.printf("\nSaldo: R$ %.2f\n", 
                                              contaCR.getBalance());
                            break;
                    } // fim do bloco de condições para o menu conta corrente
                } // fim do loop para a conta corrente
            } else if (menu == 3){ // condição para quebra do loop seleção de conta
                System.out.println("Encerrando...");
                break;
            } else { // tratamento de erro
                System.out.println("Erro...\nDigite uma opçao valida...");
            }
        } // fim do loop de escolha de conta
    }
}
