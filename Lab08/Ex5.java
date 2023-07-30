
package ex5;

public class Ex5 {

    
    public static void main(String[] args) 
    {
       
        BankAccount ba=new BankAccount() {
            @Override
            void getIntrest(double intrest) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        ba.getaccountNumber(100);
        ba.getbalance(50000);
       
        
        
        System.out.println(" Net Account balance is: "+ba.balance());
        
        
       
    }
    
}
