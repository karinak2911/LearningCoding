/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException;
         
/**
 *
 * @author CLLB19
 */
public class BirthDates {
     public static void main(String[] args) throws FileNotFoundException{ 
         try (Scanner file = new Scanner(new File ("C:\\Users\\CLLB19\\Documents\\NetBeansProjects\\SchoolPrac\\SchoolPrac\\src\\stringsChars\\BirthDates.txt"))) {
             while(file.hasNext()){
                 String line = file.nextLine();
                 try (Scanner lineScanner = new Scanner(line)) {
                     lineScanner.useDelimiter("#");
                     
                     String name = lineScanner.next();
                     String lastName = lineScanner.next();
                     String date = lineScanner.next();
                     date = date.substring(4) + date.substring(2, 4)  + "19" + date.substring(0,2);
                     
                     System.out.println(name + " " + lastName + " " + date);
                 }
             } 
         }
     }
}
