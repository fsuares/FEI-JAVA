/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author fernando
 */
public class Account {
    private double saldo;

    public Account ( double saldo ){
        if ( saldo >= 0){
            this.saldo = saldo;
        } else{
            this.saldo = 0;
            System.out.println("Erro...Saldo inválido...");
            System.out.println("Saldo inicial = R$ 0.0");
        }
    }
    
    public double getBalance() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void credit(double credit){
        this.setSaldo(getBalance() + credit);
    }
    
    public boolean debit(double debit){
        if (this.getBalance() < debit){
            System.out.println("Saldo insuficiente...");
            return false;
        } else {
            this.setSaldo(getBalance() + debit);
            return true;
        }
        
        
    }
    
    
}
