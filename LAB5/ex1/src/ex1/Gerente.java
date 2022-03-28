


/**
 *
 * @author uniffsuares
 */
public class Gerente extends Funcionario {
    private int departamento;
    private Data promocaoGerente;

    public Gerente(String nome, Long cpf, Data nascimento, Data admissao, 
                   Double salario, int departamento, Data promocaoGerente) {

        super(nome, cpf, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public Data getPromocaoGerente() {
        return promocaoGerente;
    }

    public void setPromocaoGerente(Data promocaoGerente) {
        this.promocaoGerente = promocaoGerente;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nDepartamento:" + this.getDepartamento() +
                "\nPromocao: " + this.getPromocaoGerente() + "\n");
    }
    
    
}
