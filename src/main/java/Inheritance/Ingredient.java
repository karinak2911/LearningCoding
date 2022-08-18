/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class Ingredient {
    private int qty; 
    private String unit; 
    private String name; 

    public Ingredient(int quantity, String unit, String name) {
        this.qty = quantity;
        this.unit = unit;
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setQty(int quantity) {
        this.qty = quantity;
    }
    
    public String toString(){ 
        return name + " " + qty + " " + unit; 
    }
    
}
