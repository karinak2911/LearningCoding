/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navi
 */
public class StockArray {
    private StockItem [] arr = new StockItem[150]; 
    private int size; 
    
    public StockArray(){ 
        try {
            String filename = "C:\\Users\\Karinak\\Documents\\NetBeansProjects\\LearningCoding\\data\\Stock.txt";  
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            String description; 
            double costPrice; 
            int quantity;  
            while(sc.hasNext()){ 
                description = sc.nextLine(); 

                costPrice = sc.nextDouble(); 
                quantity = sc.nextInt(); 
                
                arr[size] = new StockItem(description, costPrice, quantity); 
                    size++; 
                }
                
                
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnerArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String toString(){ 
        String output = ""; 
        for(int i = 0; i < size; i++){ 
            output += arr[i].toString(); 
        }
        return output; 
    }
    
    
    public int search(String stockCode){ 
        for(int i = 0; i < size; i++){
            if(arr[i].getStockCode().equalsIgnoreCase(stockCode))
                return i; 
        }
        return -1; 
    }
    
    
    public void adjustStock(String stockcode, int amount){ 
       int pos = this.search(stockcode); 
      int val =  arr[pos].getNumberInStock(); 
      int newQuantity = val + amount; 
      arr[pos].setNumberInStock(newQuantity);
    }
    
    
}
