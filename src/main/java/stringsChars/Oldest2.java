/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.io. *; 
import java.util.*; 
         
/**
 *
 * @author CLLB19
 */
public class Oldest2 {
     public static void main (String[] args) throws IOException{ 
         Scanner scStr = new Scanner(new File("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Test.txt")); 
         
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
    

