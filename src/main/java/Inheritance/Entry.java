/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class Entry {
    private String name, cellNo; 
    
    public Entry(String n, String c){ 
        name = n; 
        cellNo = c; 
    }
    
    public String getName(){ 
        return name; 
    }
    
    public String getCellNo(){ 
        return cellNo; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }
    
    public String toString(){ 
        return name + addSpaces(name, 14) + cellNo; 
    }

    public String addSpaces(String s, int width){ 
        String temp = ""; 
        for(int i = 0; i < width - s.length(); i++){ 
            temp = temp + " "; 
        }
        return temp; 
    }
}
