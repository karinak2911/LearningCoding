/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class Recipe {
    private String rName; 
    private String type; 
    private Ingredient [] iArr; 

    public Recipe(String rname, String rType, Ingredient[] iArr) {
        this.rName = rname;
        this.type = rType;
        this.iArr = iArr;
    }

    public String getRname() {
        return rName;
    }

    public Ingredient[] getiArr() {
        return iArr;
    }
    
    public String toString(){ 
        String tempStr = rName + " " + type + " " + "\n"; 
        for(int j = 0; j < iArr.length; j++)
            tempStr = tempStr + iArr[j] + "\n"; 
        return tempStr; 
    }
    
    
    
    
}
