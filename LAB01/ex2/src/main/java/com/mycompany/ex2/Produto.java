/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author fernando
 */
public class Produto {

    // atributos da classe
    private float valor, valor_final;

    // metodo get do atributo valor
    public float getValor(){
        return this.valor;
    }
    
    // metodo set do atibuto valor
    public void setValor(float valor){
        this.valor = valor;
    }
    
    // metodo para somar os valores dos produtos adicionado
    public float somaValor(float valor, int quant){
        valor_final = valor * quant;
        return valor_final;
    }
}
