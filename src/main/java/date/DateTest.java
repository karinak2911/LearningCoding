/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author Karinak
 */
public class DateTest {
    public static void main(String[] args) {
        //1 
        DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        LocalDate myBday = LocalDate.parse("29-11-2004", inFormatter); 
        DayOfWeek dayOfMyBday = myBday.getDayOfWeek(); 
        System.out.println(dayOfMyBday);
        
        //2
        LocalDate lasBday = LocalDate.parse("23-02-2007", inFormatter); 
        Long daysBetweenlasAndMyBday = ChronoUnit.DAYS.between(myBday, lasBday);
        System.out.println(daysBetweenlasAndMyBday);
        
        //3
     
        System.out.println("The " + myBday.getDayOfMonth() + "th " + myBday.getMonth() + " ," + myBday.getYear() );
        
        //4
        
        
    }
    
}
