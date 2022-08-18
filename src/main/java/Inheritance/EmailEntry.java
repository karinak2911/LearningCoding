/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Karinak
 */
public class EmailEntry extends Entry{
    
    private String email; 

    public EmailEntry (String n, String c, String e){ 
        super(n,c); 
        email = e; 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){ 
        String temp; 
        temp = super.toString(); 
        
        temp = temp + addSpaces(getCellNo(), 15) + email; 
        return temp; 
    }

   
}
