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
public class ActManager {
   private Act[] actArr = new Act[100]; 
    private int size = 0; 

    public ActManager() throws SQLException {
        DB db = new DB(); 
          
        ResultSet rs; 
     
            rs = db.query("SELECT * FROM tblacts;");
            
            while(rs.next()){ 
                int actNum = rs.getInt(1); 
                String actName = rs.getString(2);
                String category = rs.getString(3); 
                double sponsershipAmount = rs.getDouble(4); 
                boolean propsneeded = rs.getBoolean(5);
                
                actArr[size] = new Act(actNum, actName, category, sponsershipAmount, propsneeded); 
                size ++; 
                
            }
        
        }
    
    public void addAct( int actNum, String actName, String category, double sponsershipAmount, boolean propsNeeded) throws SQLException{ 
        Act A = new Act(actNum, actName, category, sponsershipAmount, propsNeeded); 
        actArr[size] = A; 
        size++; 
        DB db = new DB();
        String update = ""; 
        
        if(propsNeeded)
          update = "INSERT INTO tblActs(ActNum, ActName, Category, SponsorshipAmount, PropsNeeded) "
                + "VALUES(" + actNum+",\""+ actName + "\",\"" + category + "\"," + sponsershipAmount + "," + "1" + ");";
        else 
           update = "INSERT INTO tblActs(ActNum, ActName, Category, SponsorshipAmount, PropsNeeded) "
                + "VALUES(" + actNum+",\""+ actName + "\",\"" + category + "\"," + sponsershipAmount + "," + "0" + ");";
       
        System.out.println(update);
        db.update(update);
    }
   
    
    
    }
    

