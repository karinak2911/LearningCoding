/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examPracRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CLLB19
 */
public class PersonManager {
    private String logFilePath; 
    
    public PersonManager(String logFilePath){ 
        this.logFilePath = logFilePath; 
    }
    
    public void addPerson(){ 
        
        String name = JOptionPane.showInputDialog("Enter your name:"); 
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:")); 
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in kg:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in cm:")); 
        
        Person p = new Person(name, age, weight, height); 
        this.logPerson(p);
    }
    
    private void logPerson(Person p){ 
        FileWriter fw; 
        try {
            fw = new FileWriter(this.logFilePath, true);
            PrintWriter pw = new PrintWriter(fw); 
            pw.println(p.logString()); 
            pw.close();
        } catch (IOException ex) {
            System.out.println("There was an IO exception");;
        }
        
    }
    
    public void displayPeople(){ 
        try { 
            Scanner sc = new Scanner(new File(this.logFilePath)); 
            while(sc.hasNextLine()){ 
                String line = sc.nextLine(); 
                Scanner lc = new Scanner(line).useDelimiter("#"); 
                String name = lc.next(); 
                int age = lc.nextInt(); 
                double weight = lc.nextDouble(); 
                int height = lc.nextInt(); 
                
                Person p = new Person(name, age, weight, height); 
                System.out.println(p.toString());
    
            }
        } catch (FileNotFoundException ex) {
            System.out.println("A file not found exception has occured");
        }
    }
    
    
    public void highestBmi(){ 
        try{ 
            Scanner sc = new Scanner(new File(this.logFilePath)); 
        
            Person highest = null; 
            while(sc.hasNextLine()){ 
                String line = sc.nextLine(); 
                Scanner lc = new Scanner(line).useDelimiter("#"); 
                String name = lc.next(); 
                int age = lc.nextInt(); 
                double weight = lc.nextDouble(); 
                int height = lc.nextInt(); 
                
                Person p = new Person(name, age, weight, height);
                
                if(highest==null){
                    highest = p; 
                } 
                                
                if(p.getBmi() > highest.getBmi()){ 
                    highest = p; 
                } 
                

   
            }
           System.out.println("The person with the highest BMI's details are: " + highest.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("A file not found exception has occured");
        }
    }
    
}
