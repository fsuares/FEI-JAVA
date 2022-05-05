

// BasePlusCommissionEmployee herda de CommissionEmployee e tem
// acesso a membros protected de CommissionEmployee

public class BasePlusCommissionEmployee
{
   private double baseSalary; // salario-base por semana
   private CommissionEmployee comission;
   
   
   // construtor de seis argumentos
   public BasePlusCommissionEmployee(CommissionEmployee comission, double salary)
   {
      this.comission = comission;
      setBaseSalary( salary ); // valida e armazena salario-base
   } // fim do construtor BasePlusCommissionEmployee de seis argumentos
   
   
   // configura o salario-base                                    
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } // fim do metodo setBaseSalary                         

   // retorna o salario-base                                   
   public double getBaseSalary()
   {
      return baseSalary;
   } // fim do metodo getBaseSalary                            

   // calcula os lucros                 
   public double earnings()
   {
      return baseSalary + ( this.comission.getCommissionRate() * 
                            this.comission.getGrossSales() );
   } // fim do metodo earnings              

    public CommissionEmployee getComission() {
        return comission;
    }

    public void setComission(CommissionEmployee comission) {
        this.comission = comission;
    }

   // retorna a representacao String de BasePlusCommissionEmployee
   public String toString()
   {
      return String.format(                                           
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",           
         "base-salaried commission employee", this.comission.getFirstName(), 
         this.comission.getLastName(),    
         "social security number", this.comission.getSocialSecurityNumber(),              
         "gross sales", this.comission.getGrossSales(), 
         "commission rate", this.comission.getCommissionRate(),
         "base salary", baseSalary );                                 
   } // fim do metodo toString
} // fim da classe BasePlusCommissionEmployee


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/