
// Classe CommissionEmployee representa um empregado comissionado.

public class CommissionEmployee
{
   protected String firstName;                              
   protected String lastName;                               
   protected String socialSecurityNumber;                   
   protected double grossSales; // vendas brutas semanais       
   protected double commissionRate; // porcentagem da comissao

   // construtor de cinco argumentos
   public CommissionEmployee( String first, String last, String ssn, 
      double sales, double rate )
   {              
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      setGrossSales( sales ); // valida e armazena as vendas brutas       
      setCommissionRate( rate ); // valida e armazena a taxa de comissao
   } // fim do construtor CommissionEmployee de cinco argumentos

   // configura o nome 
   public void setFirstName( String first )
   {
      firstName = first;
   } // fim do metodo setFirstName 

   // retorna o nome
   public String getFirstName()
   {
      return firstName;
   } // fim do metodo getFirstName

   // configura o sobrenome 
   public void setLastName( String last )
   {
      lastName = last;
   } // fim do metodo setLastName 

   // retorna o sobrenome
   public String getLastName()
   {
      return lastName;
   } // fim do metodo getLastName

   // configura o CIC 
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // deve validar
   } // fim do metodo setSocialSecurityNumber

   // retorna o CIC
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // fim do metodo getSocialSecurityNumber 

   // configura a quantidade de vendas brutas
   public void setGrossSales( double sales )
   {
      grossSales = ( sales < 0.0 ) ? 0.0 : sales;
   } // fim do metodo setGrossSales 

   // retorna a quantidade de vendas brutas 
   public double getGrossSales()
   {
      return grossSales;
   } // fim do metodo getGrossSales 

   // configura a taxa de comissao
   public void setCommissionRate( double rate )
   {
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } // fim do m�todo setCommissionRate 

   // retorna a taxa de comissao 
   public double getCommissionRate()
   {
      return commissionRate;
   } // fim do metodo getCommissionRate 

   // calcula os lucros                 
   public double earnings()
   {
      return commissionRate * grossSales;
   } // fim do metodo earnings              

   // retorna a representacao String do objeto CommissionEmployee
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
         "commission employee", firstName, lastName, 
         "social security number", socialSecurityNumber, 
         "gross sales", grossSales, 
         "commission rate", commissionRate );
   } // fim do metodo toString
} // fim da classe CommissionEmployee

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