
package ex3;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();
        
        System.out.println("----1° Funcionario----\n");
        System.out.print("Nome: ");
        fun1.setNome(scan.next());
        System.out.print("Sobrenome: ");
        fun1.setSobrenome(scan.next());
        System.out.print("Salário mensal: R$");
        fun1.setSalario_mensal(scan.nextDouble());
        System.out.println("Salário anual: R$" + fun1.salarioAnual());
        System.out.println();
        
        System.out.println("----2° Funcionario----\n");
        System.out.print("Nome: ");
        fun2.setNome(scan.next());
        System.out.print("Sobrenome: ");
        fun2.setSobrenome(scan.next());
        System.out.print("Salário mensal: R$");
        fun2.setSalario_mensal(scan.nextDouble());
        System.out.println("Salário anual: R$" + fun2.salarioAnual());
        System.out.println();
        
        System.out.println("Qual a porcentagem de aumento deseja dar?");
        int aumento = scan.nextInt();
        fun1.aumentoSal(aumento);
        fun2.aumentoSal(aumento);
        System.out.println("----1° Funcionario----\n");
        System.out.println("Novo salário anual: R$" + fun1.salarioAnual());
        System.out.println();
        System.out.println("----2° Funcionario----\n");
        System.out.println("Novo salário anual: R$" + fun2.salarioAnual());
        
    }
    
}
