/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author fernando
 */
public class Invoice {
    private String identifier, description;
    private int quant;
    private double price;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant < 0){
            quant = 0;
        }
        this.quant = quant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            price = 0;
        }
        this.price = price;
    }
    
    public double getInvoiceAmount(){
        return this.quant * this.price;
    }
}
