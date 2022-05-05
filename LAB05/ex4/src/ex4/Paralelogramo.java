/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author fernando
 */
public class Paralelogramo extends Trapezio {
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
    }
    
    @Override
    public int area(){
        return super.lado2() * super.altura();
    }
}
