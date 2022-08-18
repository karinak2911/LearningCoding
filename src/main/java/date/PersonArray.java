/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;



import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karinak
 */
public class PersonArray {
    
     private Person [] people = new Person[20];
    private int size = 0; 
    
    public PersonArray(){ 
         String filename = "data//Dates.txt";
         DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{ 
            File f = new File(filename); 
            Scanner sc = new Scanner(f);
            String name, id, line;
            LocalDate dob; 
            while(sc.hasNext()){
                line = sc.nextLine();
                Scanner sc2 = new Scanner (line).useDelimiter("#");
                name = sc2.next();
                id = sc2.next();
                dob = LocalDate.parse(sc2.next(), inFormatter);
                people[size] = new Person(name, id, dob); 
                size++; 
            } 
        }
        catch (FileNotFoundException ex) {
            System.out.println("error");
        }
        
        
            
    }
    
     public void sortDob() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            boolean sorted = true;
            for (int i = 0; i < currentIndex; i++) {
                if (people[i].getDob().isBefore(people[i + 1].getDob())) {
                    Person temp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                    sorted = false;      
                }

            }
         
            if (sorted) {
                break;
            }
}
     } 
     
     
     public String toString(){ 
         String output = ""; 
         for(int i = 0; i < size; i++){ 
             output += people[i].toString() + "\n"; 
         }
         return output; 
     }
} 
