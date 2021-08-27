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
public class ScanSent {
    public static void main (String[] args){ 
        String input = JOptionPane.showInputDialog("Enter a sentence"); 
        int numWords = 0; 
        int threeLetterWords = 0; 
        
        Scanner scStr = new Scanner(input); 
        String word = "";  
        
        while(scStr.hasNext()){ 
            word = scStr.next(); 
            numWords++; 
            
            if(word.length()== 3)
               threeLetterWords++;  
        }
        
        scStr.close(); 
        System.out.println("The number of words in the sentence is " + numWords);
        System.out.println("The number of three letter words in the sentence is " + threeLetterWords);
    }
    
}
