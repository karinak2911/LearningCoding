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
public class CountVowels {
    public static void main (String [] args){ 
        
        String word = "Hello World"; 
        int noOfVowels = 0; 
        
        for(int i = 0; i < word.length(); i++){ 
            char letter = word.charAt(i); 
            
            switch(letter){ 
                case 'a':     
                case 'e': 
                case 'i': 
                case 'o': 
                case 'u': 
                    noOfVowels++; 
                    break;
                default: 
                    String catcher = "catcher";  
                    break; 
                }    
            }
        
        System.out.println("The number of vowels in the word " + word + " are " + noOfVowels);
   
        }
    }  



