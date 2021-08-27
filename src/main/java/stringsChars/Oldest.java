/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.util.*; 



/**
 *
 * @author CLLB19
 */
public class Oldest {
    public static void main (String[] args){ 
        String boys = "John 17 Mike 21 James 5 Tom 9 Ronaq 16 Brad 45"; 
        Scanner scStr = new Scanner (boys); 
        
       String oldName = scStr.next(); 
       int oldAge = scStr.nextInt(); 
       
       while(scStr.hasNext()){ 
           String currentName = scStr.next();
           int currentAge = scStr.nextInt(); 
           
           if(currentAge > oldAge){ 
               oldName = currentName; 
               oldAge = currentAge; 
           }
               
       }
       
       scStr.close();
        System.out.println(oldName + " "+ oldAge);
       
        
    }
    
}
