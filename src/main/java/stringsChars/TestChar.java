package stringsChars;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navi
 */
import javax.swing.JOptionPane;

public class TestChar {
    
    public static void main (String [] args){ 
       char input = (JOptionPane.showInputDialog("Enter a single character:").charAt(0));
        //boolean b = Character.isAlphabetic(c);
        
    if(Character.isDigit(input)== true){
        if(input%2 == 0)
            System.out.println("It is even");
        else 
            System.out.println("It is odd");
    } 
        
    else if (Character.isLetter(input)) {
        if(Character.isLowerCase(input))
            System.out.println("It was lower case, the uppercase is " + Character.toUpperCase(input)); 
        else 
            System.out.println("It was upper case, the lower is " + Character.toLowerCase(input)); 
    } 
    else 
            System.out.println(input + "is not alphanumerical");

            

}
        
    }
    
