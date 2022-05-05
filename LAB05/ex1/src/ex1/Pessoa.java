

/**
 *
 * @author uniffsuares
 */
public class Pessoa {
    private String nome;
    private long cpf;
    private Data nascimento;

    public Pessoa(String nome, Long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return ("\nNome:" + this.getNome() + "\nCPF: " + this.getCpf() + 
                "\nNascimento: " + this.getNascimento());
    }
    
    
}
