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
public class DateTest2 {
    public static void main(String[] args) {
       /* DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
        String input = JOptionPane.showInputDialog("Enter your birthdate in the format YYYY/MM/DD"); 
        LocalDate userInputdate = LocalDate.parse(input, inFormatter);
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("dd MMMM YY"); 
        String formatedDate = userInputdate.format(outFormatter);
        System.out.println(formatedDate);
        
        */
    DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
        String sibling1input = JOptionPane.showInputDialog("Enter your birthdate in the format YYYY/MM/DD");
        String sibling2input = JOptionPane.showInputDialog("Enter your sibling's birthdate in the format YYYY/MM/DD");
        LocalDate sibling1bdate = LocalDate.parse(sibling1input, inFormatter);
        LocalDate sibling2bdate = LocalDate.parse(sibling2input, inFormatter);
  int yearsDiff =0; 
        int monthsDiff = 0;
        int daysDiff; 
        
        if(sibling1bdate.isBefore(sibling2bdate)){ 
    Period period = Period.between(sibling1bdate, sibling2bdate);
    period.
    
 yearsDiff = (period.getYears());
    monthsDiff = (period.getMonths()); 
daysDiff = (period.getDays()); 
        } 
        else 
           Period period = Period.between(sib, );  
        
    }
    
}
