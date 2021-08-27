/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author CLLB19
 */
public class TelNums {
    public static void main(String[] args){ 
        String number = "45- 8907545"; 
        String output = ""; 
        String temp = ""; 
        
        Scanner scStr = new Scanner(number);
        scStr.useDelimiter("-"); 
        
        while (scStr.hasNext()) {
            temp = scStr.next();
            if (temp.compareTo("45")==0)
                output = output + "876-"; 
            else if (temp.compareTo("47")==0)
                output = output + "877-"; 

            if (!scStr.hasNext()) {
                output+= temp; 
            }
        
    }
        System.out.println(output);
    
}
} 