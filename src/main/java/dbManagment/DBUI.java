/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbManagment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class DBUI {
    public static void main(String[] args) {
         
        try { 
            ActManager aC = new ActManager(); 
            aC.addAct(529, "Sparkles", "dance", 1000, true);
    
        } catch (SQLException ex) {
            Logger.getLogger(DBUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
