/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class Friend {
    
     
    private String name; 
    private Date dob; 
    
    public Friend(String name, String d){ 
        try {
            this.name = name;  
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            this.dob = sdf.parse(d);
        } catch (ParseException ex) {
            Logger.getLogger(Friend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public String getName(){ 
        return name; 
    }
    
    public int getAge(){ 
        Date today = new Date(); 
        int age = 0; 
        if(today.getMonth() < this.dob.getMonth() && today.getDate() < this.dob.getDate())
            age = today.getYear() - dob.getYear() - 1; 
            else { 
                    age = today.getYear() - dob.getYear(); 
                    }
       
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public int compareTo(Friend b){
        return this.name.compareTo(b.getName());
    }
    
    public void delete(){ 
        
    }
    
    @Override
    public String toString() {
        return name + " " + dob.toString();
    }

    
}