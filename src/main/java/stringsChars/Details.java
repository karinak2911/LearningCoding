/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import javax.swing.*; 
import java.util.*; 
import javax.swing.JOptionPane;




/**
 *
 * @author CLLB19
 */
public class Details {
     public static void main (String[] args){ 
         String input = JOptionPane.showInputDialog("Enter the following with a space inbetwen each: name, ID number, height and is it true or false that you smoke") ;
         Scanner scStr = new Scanner (input); 
         
         while (scStr.hasNext()){ 
         System.out.println("The person's name is " + scStr.next());
         System.out.println("The person's ID number is " + scStr.next());
         System.out.println("The person's height in m is " + scStr.next()); 
         System.out.println("The person smoking is " + scStr.next()); 
         } 
         scStr.close(); 
         
     }
    
}
