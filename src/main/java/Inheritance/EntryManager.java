/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import dbManagment.DB;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class EntryManager {

    Entry[] eArr = new Entry[50];
    int size = 0;

    public EntryManager() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\LearningCoding\\data\\Entries.txt"));
            while (sc.hasNext()) {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
                String name = lineSc.next();
                String number = lineSc.next();
                String email = "";
                Entry e;
                if (lineSc.hasNext()) {
                    email = lineSc.next();
                    e = new EmailEntry(name, number, email);
                } else {
                    e = new Entry(name, number);
                }

                eArr[size] = e;
                size++;

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntryManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String print(){ 
        String temp =""; 
        for(int i = 0; i < size; i++){ 
            temp += eArr[i].toString() + "\n"; 
        }
        return temp; 
    }
    
    public String printEmailOnly(){ 
        String temp =""; 
        for(int i = 0; i < size; i++){ 
            if(eArr[i] instanceof EmailEntry)
                temp += eArr[i].toString() + "\n"; 
        }
        return temp; 
    }
    
    public String printNormalOnly(){ 
        String temp =""; 
        for(int i = 0; i < size; i++){ 
            if(!(eArr[i] instanceof EmailEntry)) 
                temp += eArr[i].toString() + "\n"; 
        }
        return temp; 
    }
    
    public void addToDatabse() throws SQLException{ 
        DB db = new DB(); 
        String query = "INSERT INTO entries ('Name', 'Number') VALUES ( \""  + eArr[0].getName() + "\",  \" " + eArr[0].getCellNo() + "\");"; 
        System.out.println(query);
        db.update(query);
    }
} 
