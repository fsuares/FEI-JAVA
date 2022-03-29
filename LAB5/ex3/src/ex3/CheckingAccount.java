/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author fernando
 */
public class CheckingAccount extends Account {
    
    private double taxCobranca;
    
    public CheckingAccount(double saldo, double taxCobranca){
        super(saldo);
        this.taxCobranca = taxCobranca;
    }
    
    @Override
    public void credit(double credit){
        super.credit(credit - taxCobranca);
    }
    
    @Override
    public boolean debit( double debit ){
        if (super.debit(debit)) { 
            return super.debit(taxCobranca);
        } else { 
            return false;
        }
    }
}
