/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class StringBean {
    private String str; 
    
    public StringBean(String s){ 
        str = s; 
    }

    StringBean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getStr(){ 
        return str; 
    }
    
    public void setStr(String s){ 
        str = s; 
    }
    
    public String toString(){ 
        return "The string is: + " + str; 
    }
    
    public int countWords(){ 
        Scanner sc = new Scanner(str); 
        int count = 0; 
        while(sc.hasNext()){
            sc.next();
            count++; 
        }
        return count; 
        
    }
    
    public String firstCaps(){ 
        Scanner sc = new Scanner(str); 
        String firstCapsString = ""; 
         while(sc.hasNext()){ 
             String temp = sc.next();  
             firstCapsString+= temp.substring(0, 1).toUpperCase() +temp.substring(1).toLowerCase() +  " "; 
         }
         return firstCapsString; 
    }
    
    
    
}
