/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author fernando
 */
public class SavingsAccount extends Account {
    private double taxJuros;
    
    public SavingsAccount( double saldo, double taxJuros){
        super(saldo);
        this.taxJuros = taxJuros;
    }
    
    public double calcInterest(){
        return super.getBalance() * taxJuros;
    }
    
}
