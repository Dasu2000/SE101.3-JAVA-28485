
package ex5;

public abstract class BankAccount 
{
    private int accountNumber;
    float balance;
    
    public void getaccountNumber(int accountNumber)
    {
       this.accountNumber=accountNumber;
       
       
    }
    
     public void getbalance(float balance)
    {
       
       this.balance=balance;
       
    }
    
    int accountNumber()
    {
        System.out.println("Account Number is: "+accountNumber);
        return accountNumber;
    }
    
    float balance()
    {
        System.out.println("Balance is: "+balance);
        return balance;
    }
    
    abstract void getIntrest(double intrest);
   
    
    
}
