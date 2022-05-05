/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author fernando
 */
public class Trapezio extends Quadrilatero {

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
    }
    
    public int lado1(){
        return Math.abs(super.getP2().getX() - super.getP1().getX());
    }
    
    public int lado2(){
        return Math.abs(super.getP4().getX() - super.getP3().getX());
    }
    
    public int altura(){
        return Math.abs(super.getP1().getY() - super.getP3().getY()); 
    }
    
    public int area(){
        return (((this.lado1() + this.lado2())*this.altura())/2);
    }
}
