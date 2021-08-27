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
import java.util.*; 
/**
 *
 * @author CLLB19
 */
public class Rowers {
     public static void main(String[] args) throws FileNotFoundException, IOException{ 
     
     
         Scanner file = new Scanner(new File ("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Rowing.txt"));
         
         PrintWriter outFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\RowersOutput.txt")); 
         
         PrintWriter doubleFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Double.txt"));
         PrintWriter quadFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Quad.txt")); 
         PrintWriter scullFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Scull.txt")); 
         PrintWriter pairFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Pair.txt")); 
         PrintWriter octFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Oct.txt")); 
         PrintWriter eightFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\Eight.txt")); 
        
         while(file.hasNextLine()){ 
             
             String line = file.nextLine();
             Scanner lineScanner = new Scanner(line).useDelimiter("#"); 
            
             String number = lineScanner.next(); 
             String fullname = lineScanner.next(); 
             
             Scanner nameScanner = new Scanner(fullname).useDelimiter(","); 
             String surname = nameScanner.next(); 
             String name = nameScanner.next(); 
             
             String group = lineScanner.next(); 
             int number2 = lineScanner.nextInt(); 
             
             String output = number + "\t" + name + "\t" + surname + "\t" + group + "\t" + number2; 
             
             if(group.toLowerCase().contains("double"))
                 doubleFile.println(output);
             else if(group.toLowerCase().contains("quad"))
                 quadFile.println(output);
             else if(group.toLowerCase().contains("scull"))
                 scullFile.println(output);
             else if(group.toLowerCase().contains("pair"))
                 pairFile.println(output);
             else if(group.toLowerCase().contains("eight"))
                 eightFile.println(output);
             else 
                 octFile.println(output);
             
             outFile.println(output); 
             System.out.println(output);
             
     
     } 
         
         outFile.close();
         doubleFile.close();
         quadFile.close();
         scullFile.close();
         pairFile.close(); 
         octFile.close();
 } 
    
}
