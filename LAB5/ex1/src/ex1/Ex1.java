

/**
 *
 * @author fernando suares  
 */


import java.util.ArrayList;


// classe main
public class Ex1 {

    public static void main(String[] args) {
        // metodo main
    
        
        // ArrayList para guardar objetos funcionarios
        ArrayList <Funcionario> funcionarios = new ArrayList<>();
        
        // adicionando funcionarios ao ArrayList
        // formato das datas (NASCIMENTO, ADMISSAO)
        // Funcionario (nome, cpf, nascimento, admissao, salario)
        // adicionando funcionario e instanciando objeto
        funcionarios.add(new Funcionario("Flavio", 23487412723l, 
                         new Data(10,04,1990), new Data(10, 03, 2017), 5283.)); // objeto instanciando
        // adicionando funcionario e instanciando objeto
        funcionarios.add(new Funcionario("Lucas", 982378347323l, 
                         new Data(05,07,1985), new Data(15, 07, 2021), 2736.)); // objeto instanciando
        // adicionando funcionario e instanciando objeto
        funcionarios.add(new Funcionario("Jonas", 2387732273l, 
                         new Data(30,11,1997), new Data(07, 05, 2022), 3019.)); // objeto instanciando
        
        
        // ArrayList para guardar os objetos gerentes
        ArrayList <Gerente> gerentes = new ArrayList<>();
        
        // adicionando gerentes ao ArrayList
        // formato das datas (NASCIMENTO, ADMISSAO, PROMOCAO)
        // Gerente (nome, cpf, nascimento, admissao salario,departamento, promocaoGerente)
        // adicionando gerente e instanciando objeto
        gerentes.add(new Gerente("Allan", 57643654334l, new Data(23, 04, 1998), 
                     new Data(06, 12, 2018), 123139.23, 39, 
                     new Data(02, 11, 2022))); // objeto instanciando
        
        // adicionando gerente e instanciando objeto
        gerentes.add(new Gerente("Fernando", 664334553432l, 
                     new Data(23, 07, 2012), new Data(23, 04, 1998), 44132.29, 
                     32, new Data(28, 04, 2015))); // objeto instanciando
        
        // adicionando gerente e instanciando objeto
        gerentes.add(new Gerente("Carlos", 23628787711l, new Data(13, 07, 2001), 
                     new Data(28, 06, 2005), 320932.90, 35, 
                     new Data(15, 10, 2010))); // objeto instanciando

        
        // loop para ler ArraList dos Funcionarios
	    System.out.println("||FUNCIONARIOS||");
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario.toString());
        } // fim do laco
        
        // loop para ler ArraList dos Gerentes
        System.out.println("\n||GERENTES||");
        for(Gerente gerente : gerentes){
            System.out.println(gerente.toString());
        } // fim do laco
        
    }
    
}
