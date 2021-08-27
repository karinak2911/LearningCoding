/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import javax.swing.JOptionPane;
/**
 *
 * @author Navi
 */
public class EncodeThreeWords {
    public static void main (String[] args){ 
        
        // receives user input 
        String input = JOptionPane.showInputDialog("Enter a word:").toUpperCase();
        // must be intialized before if statement 
        String newWord = ""; 
  
       
        
        if(input.length()>3)
            newWord = input.substring(3) + input.substring(0,3); 
             
        
        
        else{
             for(int i = input.length() - 1; i >= 0; i--){
             newWord = newWord + input.charAt(i);    
            } 
        }
        
        
        String incremented = ""; 
            for(int i=0;i<newWord.length();i++){ 
			incremented+=(char)(newWord.charAt(i)+1); 
		} 
            System.out.println(input + " becomes " + incremented);
    }
}
