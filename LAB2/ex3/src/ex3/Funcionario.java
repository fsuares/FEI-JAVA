
package ex3;

/**
 *
 * @author fernando
 */
public class Funcionario {
    private String nome, sobrenome;
    private double salario_mensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }
    
    public double salarioAnual(){
        return this.salario_mensal * 12;
    }
    
    public void aumentoSal(int porcentagem){
       this.salario_mensal = (this.salario_mensal/100 * porcentagem)
                              + this.salario_mensal;
    }
    
    
}
