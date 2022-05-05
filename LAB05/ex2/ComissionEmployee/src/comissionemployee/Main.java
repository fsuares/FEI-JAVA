

public class Main {
    public static void main(String[] args) {
       // instancia o objeto ComissionEmployee
      CommissionEmployee comission = new CommissionEmployee("Bob", 
                                    "Lewis", "333-33-3333", 5000, .04);
      // instancia o objeto BasePlusCommissionEmployee
      BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                                            comission, 300 );
      
      // obtem os dados do empregado comissionado com salario-base 
      System.out.println(
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getComission().getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getComission().getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getComission().getSocialSecurityNumber());
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getComission().getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getComission().getCommissionRate() );
      System.out.printf( "%s %.2f\n", "Base salary is",
         employee.getBaseSalary() );

      employee.setBaseSalary( 1000 ); // configura o salario-base                                    
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString",
         employee.toString());
    }
    
    
    /****************************************************************************
    *                                                                           *
    * O programa feito com heranca acaba sendo mais natural, tendo em vista que *
    * a comissao sempre vai ser vinculada com o funcionario e seu salario.      *
    *                                                                           *
    * ***************************************************************************
    */
}
