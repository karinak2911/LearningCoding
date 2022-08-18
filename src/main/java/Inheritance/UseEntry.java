/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import javax.swing.JOptionPane;

/**
 *
 * @author Karinak
 */
public class UseEntry {
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a person's name"); 
        String cell = JOptionPane.showInputDialog("Enter a person's cell number: "); 
        String email = JOptionPane.showInputDialog("Enter a person's email adress: "); 
        
        Entry entry;
        if (email.equals(""))
            entry = new Entry(name, cell); 
        else 
            entry = new EmailEntry(name, cell, email); 
        System.out.println(entry);
        
        System.out.println(entry);
        
        if(entry instanceof EmailEntry){ 
            EmailEntry temp = (EmailEntry) entry; 
            System.out.println("The email is " + temp.getEmail());
        } 
   
    }
   
    
    
}
