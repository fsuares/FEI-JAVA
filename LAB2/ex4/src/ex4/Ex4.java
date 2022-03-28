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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Invoice fatura = new Invoice();
        
        System.out.print("Código: ");
        fatura.setIdentifier(scan.next());
        System.out.print("Description: ");
        fatura.setDescription(scan.next());
        System.out.print("Quantity: ");
        fatura.setQuant(scan.nextInt());
        System.out.print("Price: ");
        fatura.setPrice(scan.nextDouble());
        System.out.println();
        
        System.out.println("Amount: " + fatura.getInvoiceAmount());
        
        
    }
    
}
