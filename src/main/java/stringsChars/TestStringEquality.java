/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;

/**
 *
 * @author Navi
 */
public class TestStringEquality {
    public static void main (String[] args){ 
        
        String emptyStr = new String(); 
        String str1 = new String("Hello, how are you?"); 
        String str2 = new String ("aeiou"); 
        String str3 = str1; 
        String str4 = new String (str1); 
        String strA = "xyz"; 
        String strB = "A String is an array of characters"; 
        String strC = strA; 
        String strD = new String(strA); 
        
        System.out.println((str1==str2));
                
             
        
    }
    
}
