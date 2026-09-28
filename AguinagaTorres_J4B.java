// Pay Calc App  - Methods
// Brenda Aguinaga Torres, Java-4B, F-25

import javax.swing.JOptionPane ;

public class AguinagaTorres_J4B
{  

 public static void main(String[] args)
   {
      String input ;
      double grossIncomeAmt ;
      
      input = JOptionPane.showInputDialog("What is your gross income?" ) ;
      grossIncomeAmt = Double.parseDouble(input) ;
      
      calcNetIncome(grossIncomeAmt) ; //Calling calcNetIncome and passing users input value (...)
      
      System.exit(0) ;
   }  
   
    /**
    @param grossIncAmt is how the income value entered by user of program is received and ready to use. 
   */
    public static void calcNetIncome(double grossIncAmt)
    {
    
      double taxRate = findTaxRate(grossIncAmt) ; //Declares TaxRate by Calling findTaxRate method to retrive it based on conditions. 
                                                 
      double taxAmt = grossIncAmt * taxRate ;
      double netIncomeAmt = grossIncAmt - taxAmt ;
      
      displayResults(grossIncAmt,taxAmt,netIncomeAmt) ; //Calls method displayResults and passing grossIncAmt,taxAmt,netIncomeAmt.
      
    }

    public static double findTaxRate(double grossInc)
      {
        if (grossInc > 0 && grossInc <= 50000)
         {
            return 0.10 ;
         }
      
          if (grossInc > 50000 && grossInc <= 120000)
           {
            return 0.15 ;
           }
      
            if (grossInc > 120000)
             {
               return 0.20 ;
             }
            
               return 0.0;   
       }
       
    public static void displayResults(double grossIncomeAmt, double taxAmt, double netIncome)
      {
       System.out.printf("Income Amount:     $%,10.2f\n",grossIncomeAmt) ;
       System.out.printf("Tax Amount:        $%,10.2f\n",taxAmt) ;
       System.out.printf("Paycheck Amount:   $%,10.2f\n",netIncome) ;
      }   
}      

   
      
      

     
      
      
   
   
    
     
   
