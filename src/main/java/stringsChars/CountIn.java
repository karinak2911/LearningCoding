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
public class CountIn {
    public static void main (String[] args){ 
        
        String sentence = "In sipping on interger"; 
        
        
        int count = 0; 
        for(int i = 0; i < sentence.length(); i++){ 
            
            String check = sentence.substring(i, i + 1); 
            
            if(check.compareTo("in") == 0)
                count++; 
            else 
               System.out.println(""); 
        }
        
        System.out.println("The letters in appear " + count + " times");
        
    }
}
