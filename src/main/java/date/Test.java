/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Karinak
 */
public class Test {
    public static void main(String[] args) {
       DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy"); 
        String input = JOptionPane.showInputDialog("Enter your birthdate in the format dd MMM yyyy"); 
        LocalDate userInputdate = LocalDate.parse(input, inFormatter);
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("d MMMM yy"); 
        String formatedDate = userInputdate.format(outFormatter);
        System.out.println(formatedDate); 
        
        DateTimeFormatter inFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
        String sibling1input = JOptionPane.showInputDialog("Enter your birthdate in the format YYYY/MM/DD");
        String sibling2input = JOptionPane.showInputDialog("Enter your sibling's birthdate in the format YYYY/MM/DD");
        LocalDate sibling1bdate = LocalDate.parse(sibling1input, inFormatter2);
        LocalDate sibling2bdate = LocalDate.parse(sibling2input, inFormatter2);
        if(sibling1bdate.isBefore(sibling2bdate)){ 
            System.out.println("you are older");
            Period p = Period.between(sibling1bdate, sibling2bdate); 
            System.out.println("You are older by" + p.getYears() + "years");
        
        }     
        else { 
            System.out.println("your sibling is older");
            Period p = Period.between(sibling2bdate, sibling1bdate); 
            System.out.println("They are older by" + p.getYears() + "years");
           
        }

       
       DateTimeFormatter inFormatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
        String bookingInput = JOptionPane.showInputDialog("Enter your booking in the format YYYY/MM/DD"); 
        LocalDate bookingDate = LocalDate.parse(bookingInput, inFormatter3);
        LocalDate today = LocalDate.now(); 
        LocalDate fourWeeks = today.plusWeeks(4); 
        if(bookingDate.isBefore(today))
            System.out.println("Please enter a valid date: Date is before today");
        
        else if (bookingDate.isAfter(fourWeeks))
            System.out.println("Please enter a valid date: Date is after 4 weeks");
        
        else
            System.out.println("booking added");

       
       PersonArray p = new PersonArray(); 
       p.sortDob();
        System.out.println(p.toString());
    }
}
