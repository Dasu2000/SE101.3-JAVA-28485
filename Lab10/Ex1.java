
package lab8.pkg1;
import java.util.Scanner;

public class Lab81 {

    public static void main(String[] args) 
    {
       int n1, n2, ans;
       
       Scanner sc=new Scanner(System.in);
       
       try
       {
        System.out.println("Enter first Number: ");
        n1=sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        n2=sc.nextInt();
         
        ans=n1/n2;
           System.out.println("Answer is: "+ans);
       }
       
       catch(ArithmeticException e)
               {
                   System.out.println("Number cannot devide by Zero");
               }
    }
    
}
