
package lab8.pkg3;
 import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Lab83 {

    public static void main(String[] args) 
    {
        String filePath="C:\\Users\\user\\Documents\\Document.txt";
        
        File file=new File(filePath);
       try
       {
         Scanner sc=new Scanner(file);
         while(sc.hasNextLine())
         {
             String line=sc.nextLine();
             System.out.println(line);
         }
         sc.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File cannot found");
       }
    }
    
}
