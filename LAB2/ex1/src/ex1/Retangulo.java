
package ex1;

public class Retangulo {

    // atributos da classe retangulo
    private int lado1, lado2;

    // metodo set para o Lado 1
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    // metodo get para o Lado 1
    public int getLado1() {
        return this.lado1;
    }

    // metodo set para o Lado 2
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    // metodo get para o Lado 2
    public int getLado2() {
        return this.lado2;
    }

    // metodo para calcular a area do objeto
    public int area() {
        return lado1 * lado2;
    }
    
    // metodo para calcular o premimetro do objeto
    public int perimetro(){
        return 2*(lado1 + lado2);
    }
    
    // construtores
    public Retangulo(){
        
    }
    
    public Retangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

}
