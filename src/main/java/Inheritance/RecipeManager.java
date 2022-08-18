/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class RecipeManager {
  
    private Recipe rArr [] = new Recipe[20]; 
    private int rSize = 0; 
    
  public RecipeManager(){ 
    
    String n, t, ingred, u, rn; 
    int q = 0;
    
        try { 
            Scanner scFile = new Scanner(new File("data//Recipes.txt"));
            while(scFile.hasNextLine()){ 
                Scanner lc = new Scanner(scFile.nextLine()).useDelimiter(";"); 
                n = lc.next(); 
                t = lc.next(); 
                
                Ingredient iArr [] = new Ingredient[20]; 
                int size = 0; 
                
                while(lc.hasNext()){ 
                    Scanner ingreSc = new Scanner(lc.next()).useDelimiter(" "); 
                    
                    q = ingreSc.nextInt(); 
                    u = ingreSc.next(); 
                    rn = ingreSc.nextLine(); 
                    iArr[size] = new Ingredient(q, u, rn); 
                    size++; 
                    
                    
                }
                
                Ingredient [] tempArr = new Ingredient[size]; 
                for(int i = 0; i < size; i++){ 
                    tempArr[i] = iArr[i]; 
                }
                rArr[rSize] = new Recipe(n, t, tempArr); 
                rSize++; 
           
            } scFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
    
    public String toString(){ 
        String temp = ""; 
        for(int i = 0; i < rSize; i++){ 
            temp = temp + "\n Recipe no: " + (i + 1) + " " + rArr[i].toString(); 
        }
        
       return temp; 
    }
    
    public Ingredient[] listIngredients(int rinuput1,int rinput2){ 
        int r1 = rinuput1 - 1; 
        int r2 = rinput2 -1; 
        Ingredient [] commonArr = new Ingredient[30];
        int commonArrSize = 0; 
        
        Recipe recipe1 = rArr[r1]; 
        Ingredient [] recipe1Ingredients = recipe1.getiArr(); 
        
        Recipe recipe2 = rArr[r2]; 
        Ingredient [] recipe2Ingredients = recipe2.getiArr();
        
       
        
        for(int i = 0; i < recipe1Ingredients.length ; i++){ 
            Ingredient temp1 = recipe1Ingredients[i]; 
            for(int j = 0; j < recipe2Ingredients.length; j++){ 
                Ingredient temp2 = recipe2Ingredients[j]; 
                if(temp1.getName().equalsIgnoreCase(temp2.getName())){ 
                    commonArr[commonArrSize] = temp1; 
                    commonArr[commonArrSize].setQty(temp1.getQty() + temp2.getQty()); 
                    commonArrSize++; 
                }
            }
            
          
        }
          
        Ingredient [] tempArr = new Ingredient[commonArrSize]; 
                for(int i = 0; i < commonArrSize; i++){ 
                    tempArr[i] = commonArr[i]; 
                }
                return tempArr; 
                       
        
    }
    
    
    
}
