

/**
 *
 * @author uniffsuares
 */
public class Funcionario extends Pessoa {
    private Data admissao;
    private Double salario;

    public Funcionario(String nome, Long cpf, Data nascimento, Data admissao,
                       Double salario) {
                           
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public Data getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return (super.toString()  + "\nAdmissao: " + admissao.toString() + 
                "\nSalario: " + this.getSalario());
    }
    
    
    
}
