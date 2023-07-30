
package ex5;

public class SavingAccount extends BankAccount

{
   private static final double saving_instrest_rate=0.12;
   private double intrest,netBalance;
    
 void getIntrest(double a, float balance) 
    {
         a=intrest; 
    }

    private double getbalance() 
    {
         netBalance = balance*intrest;
         return netBalance;
    }
    
 void getIntrest(double intrest)
 {
     this.intrest=intrest;
 }
    
   

    
    
}
