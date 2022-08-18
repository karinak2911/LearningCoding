/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class RecipeUI {
    public static void main(String[] args) {
        RecipeManager r = new RecipeManager(); 
        System.out.println(r.toString());
        Ingredient [] ingArr = r.listIngredients(1, 4); 
        String temp = ""; 
        for(int i = 0; i < ingArr.length; i++){ 
            temp = temp + ingArr[i] + "\n"; 
        }
        System.out.println(temp);
    }
    
}
