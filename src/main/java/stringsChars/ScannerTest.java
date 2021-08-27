/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;

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
public class ScannerTest {
    public static void main(String[] args){ 
        
        String name = JOptionPane.showInputDialog("Enter your name"); 
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        String fullname = name + "#" + lastName; 
        
        try { 
            PrintWriter p = new PrintWriter(new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\ScannerTest.txt", true));
            p.println(fullname); 
            p.close();
        } catch (IOException ex) {
            System.out.println("There was an error like my life");
        }
        
        
        
        try { 
            Scanner sc = new Scanner(new File ("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\ScannerTest.txt"));
            sc.useDelimiter("#"); 
            
            while(sc.hasNext()){ 
                String nameOut = sc.next(); 
                String lastnameOut = sc.next(); 
                System.out.println("The name of the person is " + nameOut);
             System.out.println("The name of the person is " + lastnameOut);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("There was an error ");
        }
    }
    
}
