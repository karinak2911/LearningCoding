/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class AggregateArray {
    
    private int aggregates[] = new int[1500]; 
    private int size =0; 
    
    public AggregateArray(){ 
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\arrays\\Aggregates.tzt"));
            while(sc.hasNext()){ 
                aggregates[size] = sc.nextInt(); 
                size++; 
            }
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(AggregateArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getAggregateAt(int index){ 
        return aggregates[index] ;
    }
    
    @Override
    public String toString(){ 
        String output = "";
        for(int i = 0; i < size; i++){ 
            output += aggregates[i] + " ";
        }
        return output;
    }
    
    public void improvedBubbleSort(){ 
        
    }
}
