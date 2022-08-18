/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.sql.SQLException;

/**
 *
 * @author Karinak
 */
public class EmailManagerUI {
    public static void main(String[] args) throws SQLException {
         EntryManager e = new EntryManager(); 
        System.out.println(e.printNormalOnly());
        e.addToDatabse();
    }
    
}
