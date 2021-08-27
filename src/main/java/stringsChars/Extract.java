/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*; 
/**
 *
 * @author CLLB19
 */
public class Extract {
    public static void main(String[] args) throws FileNotFoundException{ 
        
        Scanner file = new Scanner(new File ("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Emails.txt")); 
        
        
        
         while(file.hasNextLine()){ 
             String line = file.nextLine(); 
             Scanner lineScanner = new Scanner(line).useDelimiter("@"); 
             String username = lineScanner.next(); 
            
             
             String domain = lineScanner.next(); 
             Scanner domainScanner = new Scanner(domain).useDelimiter("[.]"); 
        
             String email = domainScanner.next();
             System.out.println(username + " " +  email);
          
            
             
              
             
         } 
    }
}
